package pl.javastart.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pl.javastart.model.Person;

@Component
public class PersonValidator implements Validator {
    private static final int MIN_AGE=1;

    @Override
    public boolean supports(Class<?>clazz){
        return Person.class.equals(clazz);//Metoda supports() sprawdza, czy obiekt, który chcemy zweryfikować jest wspierany przez walidator. Rozwiązanie takie pozwala skorzystać z jednego walidatora dla wielu typów obiektów.
    }
    @Override
    public void validate(Object target, Errors errors){
        Person person = (Person) target;
        checkEmail(person,errors);
        checkAge(person,errors);//Metoda validate() odpowiada za właściwą logikę weryfikacji poszczególnych pól obiektu. Niestety interfejs Validator nie jest generyczny, więc konieczne jest rzutowanie obiektu, aby wygodniej się nim posługiwać. Pierwszy parametr metody (Object target) to obiekt, którego pola będą poddane walidacji. Drugi to obiekt implementujący interfejs Errors i będzie on przechowywał informacje o błędach.
    }
    public void checkEmail(Person person, Errors errors){
        if (person.getEmail()==null)
            errors.rejectValue("email","required");//eśli email jest nullem to zapisz w obiekcie errors tę informację z kodem błędu required
        else if (!person.getEmail().contains("@"))
            errors.rejectValue("email","invalid");
    }
    private void checkAge(Person person, Errors errors){
        if (person.getAge()<PersonValidator.MIN_AGE){
            errors.rejectValue("age","invalid");
        }
    }
}
