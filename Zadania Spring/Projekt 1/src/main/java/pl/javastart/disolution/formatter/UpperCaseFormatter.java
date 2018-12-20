package pl.javastart.disolution.formatter;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.xml.soap.Text;
@Component
@Primary
public class UpperCaseFormatter implements TextFormater {
    @Override
    public String format(String originalText) {
        return originalText.toUpperCase();
    }
}
