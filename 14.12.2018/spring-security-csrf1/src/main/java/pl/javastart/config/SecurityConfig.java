package pl.javastart.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity htpp) throws Exception{
        htpp.authorizeRequests()
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }
}
