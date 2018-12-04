package pl.javanastart.decorators;

import org.springframework.stereotype.Component;

@Component
public class LowerCaseMessageDecorator implements MessageDecorator {
    @Override
    public String decorate(String msg) {
        return null;
    }
}
