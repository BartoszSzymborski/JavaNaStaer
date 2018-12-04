package pl.javanastart.printers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.javanastart.decorators.MessageDecorator;
import pl.javanastart.producers.MessageProducer;
import pl.javanastart.producers.Producer;

@Component
public class MessagePrinter {


    private MessageProducer producer;
    private MessageDecorator decorator;

    @Autowired
    public MessagePrinter(@Producer(type = Producer.ProducerType.FILE) MessageProducer producer) {
        this.producer = producer;
    }
    @Autowired(required = false)
    public void setDecorator(MessageDecorator decorator) {
        this.decorator = decorator;
    }

    public MessageDecorator getDecorator() {
        return decorator;
    }
    public void print(){
        String message = producer.getMessage();
        message = decorator!=null ? decorator.decorate(message) : message;
        System.out.println(message);
    }
}
