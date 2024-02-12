package com.example.StudentsAPI.student;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jan = new Student(
                    "Jan",
                    "jan.kowalski@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );
            Student antoni = new Student(
                    "Antoni",
                    "antoni.antonowski@gmail.com",
                    LocalDate.of(1998, Month.AUGUST, 3)
            );

            repository.saveAll(List.of(jan,antoni));
        };
    }
}
