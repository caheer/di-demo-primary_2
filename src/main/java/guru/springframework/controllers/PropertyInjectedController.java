package guru.springframework.controllers;

// Tak się nie powinno robić!


import guru.springframework.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class PropertyInjectedController {

    @Autowired
   // @Qualifier("greetingServiceImpl")
    public GreetingServiceImpl greetingServiceImpl;
    // jesli property name (greetingServiceImpl) bedzie zgodne z nazwa beana (greetingServiceImpl) spring wykryje zależności z użyciem reflection
    // public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }
}
