package com.tutorial.apidemo.springboot.tutorial;

import com.tutorial.apidemo.springboot.tutorial.models.entities.Role;
import com.tutorial.apidemo.springboot.tutorial.models.entities.User;
import com.tutorial.apidemo.springboot.tutorial.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class SpringbootTutorialApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutorialApplication.class, args);
	}

//	@Bean
//	CommandLineRunner run(UserService userService) {
//		return args -> {
//			userService.saveRole(new Role(null, "ROLE_USER"));
//			userService.saveRole(new Role(null, "ROLE_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_SUPER_ADMIN"));
//			userService.saveRole(new Role(null, "ROLE_MANAGER"));
//
//			userService.saveUser(new User(null, "Phạm Nhât Tân", "tanpham", "123", new ArrayList<>()));
//			userService.saveUser(new User(null, "Râu con cặc", "raucon", "123", new ArrayList<>()));
//			userService.saveUser(new User(null, "Nhị Thập Phong", "thapphong", "123", new ArrayList<>()));
//			userService.saveUser(new User(null, "Con nuôi fifatina", "fifa", "123", new ArrayList<>()));
//
//			userService.addRoleToUser("tanpham", "ROLE_MANAGER");
//			userService.addRoleToUser("tanpham", "ROLE_SUPER_ADMIN");
//			userService.addRoleToUser("raucon", "ROLE_USER");
//			userService.addRoleToUser("raucon", "ROLE_ADMIN");
//			userService.addRoleToUser("thapphong", "ROLE_USER");
//			userService.addRoleToUser("fifa", "ROLE_MANAGER");
//		};
//	}

}
