package com.generation.helloword.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	// Endpoint 1: "Hello World!"
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}

	// Endpoint 2: Lista de BSM's da Generation Brasil
	@GetMapping("/bsm")
	public List<String> listarBSMs() {
		return Arrays.asList("Responsabilidade Pessoal", "Mentalidade de Crescimento", "Trabalho em Equipe",
				"Orientação ao Futuro", "Orientação ao Detalhe", "Comunicação", "Proatividade", "Persistência");
	}

	// Endpoint 3: Objetivos de aprendizagem desta semana
	@GetMapping("/objetivos")
	public List<String> objetivosAprendizagem() {
		return Arrays.asList("Aprender mais sobre Spring Boot", "Entender melhor como funciona as APIs",
				"Entender o funcionamento de controllers no Spring", "Colocar em pratica o código para boas práticas");
	}

}
