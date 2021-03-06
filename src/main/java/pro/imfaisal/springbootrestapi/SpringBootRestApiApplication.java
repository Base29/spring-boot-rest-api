package pro.imfaisal.springbootrestapi;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.imfaisal.springbootrestapi.student.Student;

@SpringBootApplication
@RestController
public class SpringBootRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(1L, "Faisal", "faisalblink@gmail.com", LocalDate.of(1981, Month.JUNE, 8), 35));
	}

}
