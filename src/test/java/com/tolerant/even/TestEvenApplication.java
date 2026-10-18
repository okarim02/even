package com.tolerant.even;

import org.springframework.boot.SpringApplication;

public class TestEvenApplication {

	public static void main(String[] args) {
		SpringApplication.from(EvenApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
