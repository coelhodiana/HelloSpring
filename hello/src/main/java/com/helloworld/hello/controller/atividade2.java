package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade2")
public class atividade2 {
	
	@GetMapping
	public String atividade2() {
		return "Comunicação";
	}
}
