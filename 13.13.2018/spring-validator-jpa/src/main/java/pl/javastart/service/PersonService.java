package pl.javastart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.javastart.model.Person;
import pl.javastart.repository.PersonRepository;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.Set;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

    public void add(Person person){
        try {
            personRepository.add(person);
        }catch (ConstraintViolationException e){
            Set<ConstraintViolation<?>> errors = e.getConstraintViolations();
            errors.forEach(err->System.out.println(
                    err.getPropertyPath()+""+
                            err.getInvalidValue()+""+
                            err.getMessage()));
        }
    }
}
