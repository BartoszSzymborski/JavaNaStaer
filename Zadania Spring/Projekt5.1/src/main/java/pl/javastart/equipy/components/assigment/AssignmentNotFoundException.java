package pl.javastart.equipy.components.assigment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Nie istnieje przyisanie o takim ID")
public class AssignmentNotFoundException extends RuntimeException{
}
