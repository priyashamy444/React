package com.example.project1;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.project1.model.User;

import com.example.project1.repository.UserRepository;


@SpringBootApplication

public class Project1Application implements CommandLineRunner {

	
public static void main(String[] args) {
		
SpringApplication.run(Project1Application.class, args);
	}
   
 @Autowired
	
private UserRepository userRepository;

	
 @Override
    public void run(String...args) throws Exception {
        this.userRepository.save(new User("Priya", "shanmugam", "priya@gmail.com"));
        this.userRepository.save(new User("shan", "priya", "shammy@gmail.com"));
        this.userRepository.save(new User("arun", "arun", "arun@gmail.com"));
        this.userRepository.save(new User("arasu", "P", "arasu@gmail.com"));
        this.userRepository.save(new User("karthi", "M", "karthi@gmail.com"));
        this.userRepository.save(new User("riya", "priya", "riya@gmail.com"));

    }
}
