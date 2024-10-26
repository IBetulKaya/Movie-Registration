package com.example.frontend;

import com.example.frontend.model.User;
import com.example.frontend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontendApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(FrontendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User("John Doe", "Nieuwmarkt 34", "john.doe@acme.org", 30, false, "https://www.pngall.com/wp-content/uploads/10/Plus-Symbol-Vector-PNG-Cutout.png");
		userService.save(user);
		user = new User("Jane Doe", "Nieuwmarkt 34", "jane.doe@acme.org", 29, true, "https://www.pngall.com/wp-content/uploads/10/Plus-Symbol-Vector-PNG-Cutout.png");
		userService.save(user);
		user = new User("Baby Doe", "Nieuwmarkt 34", "baby.doe@acme.org", 1, true, "https://www.pngall.com/wp-content/uploads/10/Plus-Symbol-Vector-PNG-Cutout.png");
		userService.save(user);
		user = new User("Granny Doe", "Nieuwmarkt 34", "granny.doe@acme.org", 73, true, "https://www.pngall.com/wp-content/uploads/10/Plus-Symbol-Vector-PNG-Cutout.png");
		userService.save(user);
	}
}
