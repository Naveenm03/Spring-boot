package com.example.demo;
import org.springframework.web.bind.annotation.*;
@RestController

public class color {
	@GetMapping("color")
	public String getMyFav(){
		String yourFavColor="Green";
		return "My favorite color is "+ yourFavColor;
	}

}
