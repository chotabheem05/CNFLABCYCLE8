package com.example.LabCycle08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LabCycle08Application {

	public static void main(String[] args) {
		SpringApplication.run(LabCycle08Application.class, args);
	}

}



/*
Go inside file:
 sudo docker build -t lab9 .
 sudo docker images
sudo docker run -p 8080:8080 lab9

*/