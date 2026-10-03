package uk.ac.westminster.product;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
       public String hello() {
        return "Hello";
       }
    @GetMapping("/bye")
    public String bye() {
        return "bye";
    }

}
