package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.beans.NamesRepository;

import java.util.List;

@SpringBootApplication
public class Spring5DiBootApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx =  SpringApplication.run(Spring5DiBootApplication.class,args);

        NamesRepository namesRepo = ctx.getBean(NamesRepository.class);
        List<String>allNames = namesRepo.getAll();
        allNames.forEach(System.out::println);

        ctx.close();
    }
}
