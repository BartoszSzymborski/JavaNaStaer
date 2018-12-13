package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.model.Person;
import pl.javastart.repository.PersonRepository;
import pl.javastart.service.PersonService;

@SpringBootApplication
public class SpringValidatorJpaApplication {

    public static void main(String[] args) {
      ConfigurableApplicationContext ctx = SpringApplication.run(SpringValidatorJpaApplication.class, args);

        Person person = new Person("Jan",null,"zle dane mail",0);
        PersonService personService = ctx.getBean(PersonService.class);
        personService.add(person);

        ctx.close();
    }

}

