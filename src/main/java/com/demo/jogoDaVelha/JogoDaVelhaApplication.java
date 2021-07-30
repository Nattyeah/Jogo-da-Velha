package com.demo.jogoDaVelha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JogoDaVelhaApplication {

	public static void main(String[] args) {
		Jogo jogo = new Jogo();
		SpringApplication.run(JogoDaVelhaApplication.class, args);
	}

}
