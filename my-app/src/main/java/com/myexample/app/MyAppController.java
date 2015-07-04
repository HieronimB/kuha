package com.myexample.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alicja on 2015-07-03.
 */

@RestController
@EnableAutoConfiguration
public class MyAppController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
