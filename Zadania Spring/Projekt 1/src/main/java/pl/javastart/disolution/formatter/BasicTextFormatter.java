package pl.javastart.disolution.formatter;

import org.springframework.stereotype.Component;

@Component
public class BasicTextFormatter implements TextFormater {
    @Override
    public String format(String originalText) {
        return originalText;
    }
}
