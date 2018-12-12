package pl.javastart.controller.rest;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import pl.javastart.model.City;
import pl.javastart.repository.CityRepository;

//W tym momencie mamy prostą aplikację wykorzystującą Spring MVC i Spring Data. Wyobraźmy sobie jednak, że chcemy teraz stworzyć do naszej aplikacji dodatek w postaci aplikacji mobilnej. Musimy w jakiś sposób umożliwić pobieranie oraz zapisywanie nowych danych. Najprościej zrobić to poprzez stworzenie API REST. W tym celu definiujemy dodatkowy kontroler.
@RestController
@RequestMapping("/api/cities")
public class CityControllerRest {
    private CityRepository cityRepo;

    @Autowired
    public CityControllerRest(CityRepository cityRepo){
        this.cityRepo = cityRepo;
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<City>getCities(@RequestParam(defaultValue = "name") String orderBy){
        List<City>cities = cityRepo.findAll();
        if ("name".equals(orderBy)){
            cities.sort(Comparator.comparing(City::getName));
        }else if ("population".equals(orderBy)){
            cities.sort(Comparator.comparing(City::getPopulation));
        }
        return cities;
    }
    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<City>getCity(@PathVariable Long id){
        return cityRepo.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(()->ResponseEntity.notFound().build());
    }
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveCity(@RequestBody City city){
        cityRepo.save(city);
    }

}
//W kontrolerze definiujemy metody do obsługi endpointów pozwalających pobrać listę wszystkich miast, pojedynczego miasta na podstawie id oraz na wstawienie nowego miasta przesłanego w formacie JSON. Najciekawsza jest metoda getCity(), która zwraca pojedyncze miasto. Pobiera ona najpierw obiekt z bazy na podstawie id używając metody findById(). Metoda ta zwraca obiekt typu Optional<City>, więc korzystając z dobrodziejstw typu Optional wynik mapujemy na ResponseEntity.ok jeśli obiekt o takim id istnieje lub ResponseEntity.notFound jeśli jest inaczej.
