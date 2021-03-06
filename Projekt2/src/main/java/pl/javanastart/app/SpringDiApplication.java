package pl.javanastart.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import pl.javanastart.beans.MessagePrinter;
import pl.javanastart.beans.MessageProducer;


@Configuration
@ComponentScan
public class SpringDiApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringDiApplication.class);

        MessagePrinter bean1 = ctx.getBean(MessagePrinter.class);
        bean1.printMessage();
        MessagePrinter bean2 = ctx.getBean(MessagePrinter.class);
        bean2.printMessage();

        ctx.close();
    }
}
