package boot.tutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstantHelloController {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello Welcome To String Boot !";
    }

}
