package com.ApiRePersonas;

import com.ApiRePersonas.model.Student;
import com.ApiRePersonas.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiRestPersonasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestPersonasApplication.class, args);
	}

    @Autowired
    private StudentRepository repository;
    @Override
    public void run(String... args) throws Exception {
      //  Student estudiante1 = new Student("Juan Daniel","Perez","Falcon", 27,"juan.perez@uttt.com.mc","7713354206","letyfalcon@gmail.com","7713852069");
    //repository.save(estudiante1);
    }
}
