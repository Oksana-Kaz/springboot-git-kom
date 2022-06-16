package edu.cpcc.capstone.taskbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootGitKomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGitKomApplication.class, args);
		
		PrintMessage.printMessage();
	}

}
