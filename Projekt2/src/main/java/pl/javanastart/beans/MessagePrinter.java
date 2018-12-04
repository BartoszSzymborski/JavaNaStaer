package pl.javanastart.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MessagePrinter {

    @Autowired
    private MessageProducer producer;

    public void printMessage(){
        System.out.println(producer.getNumber());
    }
}
