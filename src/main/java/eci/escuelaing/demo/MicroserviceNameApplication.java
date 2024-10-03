package eci.escuelaing.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MicroserviceNameApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceNameApplication.class, args);
    }

    @RestController
    class NameController {
        @GetMapping("/name")
        public String getName() {
            return "CARLOS ALBERTO SORZA GÓMEZ";
        }
    }
}