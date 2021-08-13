package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CirculoRestController {
	@GetMapping("/")
	public Circulo getArea(@RequestParam double raio) {
		Circulo c1 = new Circulo(raio);
		return c1;
		//return "Area do c�rculo: " + c1.getArea();
	}
}
