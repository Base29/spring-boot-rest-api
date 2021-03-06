package pro.imfaisal.springbootrestapi.student;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import antlr.collections.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student faisal = new Student("Faisal", "faisalblink@gmail.com", LocalDate.of(1981, Month.JUNE, 8), 35);
            Student sadaf = new Student("Sadaf", "sadaffaisalblink@gmail.com", LocalDate.of(1991, Month.SEPTEMBER, 17),
                    25);

            repository.saveAll(List.of(faisal, sadaf));
        };

    }
}
