package pl.javastart.components.device;

public class CategoryNotFoundException extends RuntimeException{
    CategoryNotFoundException(String message){
        super(message);
    }
}
