package com.moonlightmoth.housedevil.testping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.jar.Manifest;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Starting ping service of version 1.0");
	}

	@GetMapping(path = "/ping")
	public String pingOut()
	{
		return "online";
	}
}
