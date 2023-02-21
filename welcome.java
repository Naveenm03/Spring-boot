package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController

public class welcome {

	@GetMapping("hello")
	public String Welcome() {
		return "Welcome String Boot!";
		
		
	}
}
