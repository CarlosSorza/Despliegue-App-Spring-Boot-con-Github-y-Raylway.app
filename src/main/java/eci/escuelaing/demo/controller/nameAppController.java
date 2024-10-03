package eci.escuelaing.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
public class nameAppController {

    @GetMapping
    public String getName() {
        return "CARLOS ALBERTO SORZA GÓMEZ";
    }
}
