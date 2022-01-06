package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TestController {
	@GetMapping("/cg")
	public String call() {
		return "<body bgcolor='yellow' text='red'><h1>I am SPRING BOOT!!!</h1></body>";

	}

}
