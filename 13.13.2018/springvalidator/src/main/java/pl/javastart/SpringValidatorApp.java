package pl.javastart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javastart.model.Person;
import pl.javastart.service.PersonService;

@Configuration
@ComponentScan
public class SpringValidatorApp {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringValidatorApp.class);

        PersonService personService = ctx.getBean(PersonService.class);

        Person person1 = new Person("Jan","Kowalski","jan@kowalski.pl",32);
        personService.addPerson(person1);

        Person person2 = new Person("Anna",null,"nietaki mail",0);
        personService.addPerson(person2);

        System.out.println("People " + personService.getPeople().size());
        for (Person p: personService.getPeople()){
            System.out.println(p);
        }
        ctx.close();
    }
}
//Jak widać korzystanie ze Spring Validatora w porównaniu do BV jest dużo bardziej skomplikowane, interfejs Validator nie jest generyczny, musimy używać obiektu Errors do bindowania komunikatów o błędach, musimy definiować kody i komunikaty błędów.
//
//Z tych powodów w Springu walidacja najczęściej oparta jest o połączenie Bean Validation jako silnika walidacji (adnotacje + ograniczenia) oraz mechanizmu bindowania komunikatów w celu przekazania ich np. z kontrolera do widoku w Spring MVC.
//
//
