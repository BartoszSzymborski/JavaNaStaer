package pl.javastart.equipy.components.assigment;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "To przypisanei już zostało zakończone")
public class AssignmentAlreadyFinishedException extends RuntimeException {
}
