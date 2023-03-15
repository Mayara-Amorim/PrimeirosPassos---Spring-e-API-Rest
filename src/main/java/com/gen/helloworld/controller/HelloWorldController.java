package com.gen.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {
	@GetMapping
	public String hello() {
		return "Olá, Spring";
	}
	@GetMapping ("/bsm")
	public String bsm() {
		return    "1- Responsabilidade Pessoal\n"
				+ "2- Mentalidade de Crescimento\n "
				+ "3- Orientação ao Futuro\n"
				+ "4- Persitencia\n "
				+ "5- Comunicação\n"
				+ "6- Orientação ao Detalhe\n"
				+ "7- Trabalho em Equipe\n"
				+ "8- Proatividade\n";
	}
	@GetMapping("/objetivos")
	public String objetivos() {
		return "Dar meus primeiros passos com Spring\n"
				+ "Começar o projrto Blog Pessoal <3";
		
	}

}
