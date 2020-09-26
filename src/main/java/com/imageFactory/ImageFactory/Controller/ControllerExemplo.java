package com.imageFactory.ImageFactory.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class ControllerExemplo {
	
	@GetMapping
	public ResponseEntity<String> resposta () {
		return ResponseEntity.ok("Hello Worldd");
	}

}
