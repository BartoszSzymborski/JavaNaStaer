package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import pl.javastart.model.Message;
import pl.javastart.service.MessageService;

@SpringBootApplication
public class SpringValidatorCustomConstrainsApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext ctx = SpringApplication.run(SpringValidatorCustomConstrainsApplication.class, args);

        MessageService msgService = ctx.getBean(MessageService.class);
        Message msg = new Message("Hello","cholercia to brzydkie słowo");
        boolean verifMessage = msgService.verifyMessage(msg);
        System.out.println("Wiadomość poprawna? " + verifMessage);
        ctx.close();

    }
    @Bean
    public Validator validator(){
        return new LocalValidatorFactoryBean();
    }

}

