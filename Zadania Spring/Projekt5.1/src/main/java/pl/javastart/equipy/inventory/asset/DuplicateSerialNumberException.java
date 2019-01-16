package pl.javastart.equipy.inventory.asset;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT,reason = "Produkt o takim ID już istnieje")
public class DuplicateSerialNumberException extends RuntimeException {
}
