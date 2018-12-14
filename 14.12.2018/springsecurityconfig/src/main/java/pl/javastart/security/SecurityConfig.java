package pl.javastart.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    //Klasa konfiguracji jest bardzo prosta i tak naprawdę ogranicza się do tego, że znajduje się nad nią adnotacja @EnableWebSecurity. To dzięki niej utworzony zostanie filtr springSecurityFilterChain, do którego delegowane są żądania przez DelegatingFilterProxy.
//Klasa konfiguracji musi jeszcze zostać dodana do kontekstu Springa. Ponieważ zabezpieczenie ma dotyczyć całej aplikacji, najczęściej będziemy to robili wymieniając tę klasę w klasach konfiguracji rootContext.

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user1").password("{noop}pass1").roles("USER");
    }
    //Powyższa metoda configure() pozwala zdefiniować źródło danych, w którym przechowywane są informacje o użytkownikach
//do hasła dopisaliśmy dziwny fragment {noop}. Wynika on z mechanizmu wprowadzonego w Spring Security 5 (który jest używany w Spring Boocie 2) i pozwala on przechowywać hasła zakodowane przy pomocy różnych algorytmów.
// Taki sposób przechowywania haseł (plain text) nie jest bezpieczny i powinien być używany do celów edukacyjnych lub testowych.
}
