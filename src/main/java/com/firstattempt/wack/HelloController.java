package com.firstattempt.wack;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Annotation, it's for the compiler. 
*/
/*
RestController: Denote that the class can be used by Spring MVC to handle web requests
*/
@RestController
public class HelloController {
    
    /*
    maps "/" to the index() method. wut.
    */
    @GetMapping("/")
    public String index() {
        return "Henlo. Za Warudo is a kut-ta.\n";
    }
}