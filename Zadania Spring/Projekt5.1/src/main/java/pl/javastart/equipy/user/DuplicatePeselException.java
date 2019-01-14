package pl.javastart.equipy.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Uzytkownik z takim peselem już istnieje")
public class DuplicatePeselException extends RuntimeException {
}
