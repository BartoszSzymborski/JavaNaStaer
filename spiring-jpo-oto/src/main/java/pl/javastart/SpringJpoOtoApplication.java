package pl.javastart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.javastart.dao.UserDao;
import pl.javastart.dao.UserDetailsDao;
import pl.javastart.model.User;
import pl.javastart.model.UserDetails;

import java.awt.print.Book;

@SpringBootApplication
public class SpringJpoOtoApplication {

    public static void main(String[] args) {
       ConfigurableApplicationContext ctx =  SpringApplication.run(SpringJpoOtoApplication.class, args);
// dla OneToOne jednokierunkowej
//        UserDao userDao = ctx.getBean(UserDao.class);
//        User user = new User("johny234","strongPass","johnny@gmail.com");
//        zapisujemy bez userDetails
//        userDao.save(user);
//
 //       userDetails
//        UserDetails details = new UserDetails("Johnny","Kowalski","Krakwoska 55, Warszawa");
//        user.setDetails(details);
//        userDao.update(user);
//
 //       update parametrów wybranych
//        user.setPassword("passPass");
//        user.getDetails().setFirstName("Piotr");
//        userDao.update(user);
//
 //       akutlany stan w DS
//        User userFromDb = userDao.get(1L);
//        System.out.println(userFromDb);
 //       delete
//        userDao.delete(user);
  //      aktualnu stan w DS po usunięciu
//        userFromDb = userDao.get(1L);
//        System.out.println(userFromDb);
//        ctx.close();
// dla OnetoOne dwukierunkowej

     UserDao userDao = ctx.getBean(UserDao.class);
     User user = new User("johnny234","strongPass","johnny@gmail.com");
     UserDetails userDetails = new UserDetails("Johnny","Kowalski","Krakowska 55, Warszawa");
     user.setDetails(userDetails);
     userDao.save(user);

     UserDetailsDao userDetailsDao = ctx.getBean(UserDetailsDao.class);
     UserDetails getUserDetails = userDetailsDao.get(1L);
     System.out.println(getUserDetails.getUser());

     ctx.close();
    }
}
