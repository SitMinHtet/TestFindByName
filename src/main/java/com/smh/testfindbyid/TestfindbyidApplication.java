package com.smh.testfindbyid;

import com.smh.testfindbyid.service.CityService;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Data
public class TestfindbyidApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestfindbyidApplication.class, args);
    }

/*
    private final CityService cityService;
    @Override
    public void run(String... args) throws Exception {

        var id1= 29;
        cityService.findById(id1).ifPresent(System.out::println);

        var id2 = 3L;
        var value1 = cityService.findById(id2);

        if (value1.isPresent()) {
            System.out.println(value1.get());
        } else {
            System.out.printf("No city found with id %d%n", id2);
        }
    }

 */
}
