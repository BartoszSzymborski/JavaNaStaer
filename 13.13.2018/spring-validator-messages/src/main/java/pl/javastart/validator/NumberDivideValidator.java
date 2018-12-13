package pl.javastart.validator;

import pl.javastart.constraint.Divided;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.Instant;

public class NumberDivideValidator implements ConstraintValidator<Divided,Integer> {

    private int divider;

    @Override
    public void initialize(Divided annotation){
        divider = annotation.by();
    }

    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context){
        return value%divider==0;
    }
}
