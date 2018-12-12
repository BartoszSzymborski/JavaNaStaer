package pl.javastart.controller.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.javastart.model.City;
import pl.javastart.repository.CityRepository;

import java.util.List;

@Controller
@RequestMapping("/cities")
public class CityControllerMvc {

    private CityRepository cityRepo;

    @Autowired
    public CityControllerMvc(CityRepository cityRepo){
        this.cityRepo = cityRepo;
    }

    @GetMapping
    public String listCities(Model model){
        List<City>cities = cityRepo.findAll();
        model.addAttribute("cityList",cities);
        return "list";
    }
    @PostMapping
    public String addCity(@ModelAttribute City cityModel, RedirectAttributes redirectAttr){
        cityRepo.save(cityModel);
        redirectAttr.addFlashAttribute("message","city added successfuly");
        return "redirect:/";
    }
}
//Nowością, którą tutaj wykorzystujemy jest argument typu RedirectAttributes w metodzie obsługującej żądanie POST z formularza. Jeśli sięgniemy pamięcią do obsługi przekierowań w Springu, to przypomnimy sobie, że serwer wysyła w takiej sytuacji kod 302 z nowym adresem, następnie klient (przeglądarka) wyśle do serwera drugie zapytanie typu GET tracąc atrybuty ustawione w oryginalnym żądaniu (a tym samym w modelu Springa). Dzięki wykorzystaniu  metody addFlashAttribute(), atrybut jest zapisywany tymczasowo w sesji, a następnie z niej usuwany. Pozwala to sobie poradzić w naszym przypadku z problemem tego, że po dodaniu rekordu do bazy chcemy przekierować użytkownika do strony głównej jednocześnie wyświetlając mu komunikat o powodzeniu.