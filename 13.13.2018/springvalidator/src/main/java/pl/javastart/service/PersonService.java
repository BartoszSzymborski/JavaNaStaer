package pl.javastart.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
import org.springframework.validation.Validator;

import pl.javastart.model.Person;

@Service
@PropertySource("classpath:error_messages.properties")//@PropertySource("classpath:messages.properties"), aby wskazać źródło komunikatów, które będą wykorzystywane przy walidacji
public class PersonService {
    private Set<Person> people;

    private Validator validator;

    @Autowired
    private Environment env;// W tym samym celu wstrzykujemy obiekt Enviroment

    @Autowired
    public PersonService(Validator validator){
        this.validator = validator;
        this.people = new HashSet<>();
    }

    public void addPerson(Person person) {
        Errors errors = new BeanPropertyBindingResult(person, "person");
        validator.validate(person, errors);
        if(errors.hasErrors()) {
            System.err.printf("There are errors(%d):\n", errors.getErrorCount());//Metoda getErrorCount() zwraca ilość błędów, które wystąpiły przy walidacji obiektu, errors.getAllErrors() zwraca listę wszystkich błędów walidacji w postaci obiektów typu ObjectError.
            for(ObjectError err: errors.getAllErrors()) {
                System.err.println(env.getProperty(err.getCode()));//Wywołanie metody env.getProperty(err.getCode()) powoduje pobranie z pliku error_messages.properties komunikatu błędu na podstawie przekazanego kodu
            }//Metoda getCode() zwraca domyślny kod błędu, czyli ten ustawiony przez nas ręcznie przy wywoływaniu metod rejectValue() - u nas required lub invalid.
        } else {
            people.add(person);
        }
    }
    public Set<Person>getPeople(){
        return this.people;
    }
}
