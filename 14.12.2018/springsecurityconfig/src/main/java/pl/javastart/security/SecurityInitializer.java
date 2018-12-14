package pl.javastart.security;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
//Powyższa klasa utworzy obiekt DelegatingFilterProxy, czyli łącznik pomiędzy kontekstem serwletów, a kontekstem Springa. Klasa AbstractSecurityWebApplicationInitializer, po której dziedziczymy, implementuje interfejs WebApplicationInitializer, więc zostanie automatycznie zarejestrowana (tak samo jak to było z AbstractAnnotationConfigDispatcherServletInitializer).

}
