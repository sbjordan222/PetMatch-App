package com.tts.PetApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import com.tts.PetApp.Service.UserService;


@Controller
@ControllerAdvice //This makes the @ModelAttribute's of this controller available to all controllers, for the navbar.
public class MainController {
@Autowired
UserService userService;
	@GetMapping("/")
	public String main() {
		return "main";
	}
}