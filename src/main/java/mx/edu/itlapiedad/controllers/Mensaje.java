package mx.edu.itlapiedad.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/devops")
public class Mensaje {
	
	@GetMapping("/hola")
	public String MostrarHola() {
		return "Hola Devops";
	}

}
