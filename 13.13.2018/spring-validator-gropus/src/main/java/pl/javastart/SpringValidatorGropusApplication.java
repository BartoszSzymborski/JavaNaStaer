package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import pl.javastart.model.Project;
import pl.javastart.service.ProjectService;

import java.time.Instant;
import java.util.Date;

@SpringBootApplication
public class SpringValidatorGropusApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringValidatorGropusApplication.class, args);

        ProjectService projectService =ctx.getBean(ProjectService.class);

        Project project = new Project();
       project.setTitle("Prototyp samochodu"); //można zakomentować żeby sprawdzić poprawność
        project.setDate(Date.from(Instant.now()));

        boolean validateDraft = projectService.validateDraft(project);
        System.out.println("Draft project is good ?" + validateDraft);

        project.setOwner("John Doe");
        project.setDescription("opis");//celowy bład do sprawdenia poprawnosci

        boolean validateFull = projectService.validateFull(project);
        System.out.println("Full project is good? " + validateFull);

    }
    @Bean
    public Validator validator(){
        return new LocalValidatorFactoryBean();
    }

}

