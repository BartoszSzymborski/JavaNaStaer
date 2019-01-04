package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import pl.javastart.app.ApplicationController;
import pl.javastart.components.category.Category;
import pl.javastart.components.customer.Customer;
import pl.javastart.components.device.Device;
import pl.javastart.components.device.DeviceRepository;

import java.util.Scanner;

@SpringBootApplication
public class Projekt3Application {

    public static void main(String[] args) {
       ConfigurableApplicationContext ctx =  SpringApplication.run(Projekt3Application.class, args);
        ApplicationController controller = ctx.getBean(ApplicationController.class);
        controller.mainLoop();
    }
    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

}

