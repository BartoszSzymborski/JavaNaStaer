package pl.javastart.service.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import pl.javastart.models.Book;

import java.util.Arrays;

@Aspect
@Component
public class LoggerAscpet {

    @Before("pl.javastart.service.aspects.AscpetUtil.allBookRepositoryMethods()")
    public void logInBefore(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        System.out.printf("Log before %s with args: %s\n", joinPoint.getSignature(), Arrays.toString(args));
    }

    @After("pl.javastart.service.aspects.AscpetUtil.allBookRepositoryMethods()")
    public void logInAfter(JoinPoint joinPoint){
        System.out.printf("Method %s executed \n", joinPoint.getSignature());
    }
    @AfterThrowing(pointcut = "pl.javastart.service.aspects.AscpetUtil.allBookRepositoryMethods()", throwing = "error")
    public void logError(JoinPoint joinPoint, Throwable error){
        System.out.printf("Method %s finished with error %s\n",joinPoint.getSignature(),error.getMessage());
    }
    @AfterReturning(pointcut = "execution(* pl.javastart.service.BookRepository.get(..))&& args(isbn)", returning = "result")
    public void logSucces(JoinPoint joinPoint, Book result, String isbn){
        if (result !=null)
            System.out.printf("Method get() successfully retunred value %s for isbn %s\n", result,isbn);
    }
}
