package pl.javanastart.decorators;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javanastart.decorators.MessageDecorator;

@Component
@Primary
public class UpperCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String msg) {
        return msg.toUpperCase();
    }
}
