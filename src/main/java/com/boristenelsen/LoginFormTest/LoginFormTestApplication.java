package com.boristenelsen.LoginFormTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
*
* Wichtig merke:
* Wenn du eine eigene Login-Form mit Thymeleaf baust dann achte darauf dass du die verfickten attribute vom user und password Feld auch genau so nennst.
*
*
* */

@SpringBootApplication
public class LoginFormTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginFormTestApplication.class, args);
	}

}
