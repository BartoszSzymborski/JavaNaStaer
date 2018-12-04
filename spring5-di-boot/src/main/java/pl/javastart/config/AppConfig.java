package pl.javastart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.javastart.config.profiles.ProdProfile;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    @Profile("default")
    public DatabaseDatasource getH2Datasource(){
        return (() -> Arrays.asList("KasiaTest","bartekTest","AniaTest","KrzysztofTest"));

    }
    @Bean
    @ProdProfile
    public DatabaseDatasource getMysqlDataSource(){
        return new DatabaseDatasource() {
            @Override
            public List<String> getDatabase() {
                try {
                    Path pathFile = new File(getClass().getResource("/data.txt").toURI()).toPath();
                    List<String>allLines = Files.readAllLines(pathFile);
                    return allLines;
                }catch (IOException | URISyntaxException e){
                    e.printStackTrace();
                }
                return new ArrayList<>();
            }
        };
    }
}
