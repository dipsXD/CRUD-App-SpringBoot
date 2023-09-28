package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
@Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student meera = new Student(
                    "Meera",
                    "meera@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 11)
            );

            Student radha = new Student(
                    "Radha",
                    "ra@gmail.com",
                    LocalDate.of(2004, Month.AUGUST, 15)
            );

            repository.saveAll(List.of(meera, radha));
        };
    }
}
