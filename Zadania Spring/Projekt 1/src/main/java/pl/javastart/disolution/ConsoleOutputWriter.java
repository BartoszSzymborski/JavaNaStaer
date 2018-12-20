package pl.javastart.disolution;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javastart.disolution.formatter.TextFormater;

@Component
public class ConsoleOutputWriter {
    private TextFormater textFormater;

    @Autowired
    ConsoleOutputWriter(TextFormater textFormater){
        this.textFormater = textFormater;
    }

    public void println(String text){
        String formattedText = textFormater.format(text);
        System.out.println(formattedText);
    }

}
