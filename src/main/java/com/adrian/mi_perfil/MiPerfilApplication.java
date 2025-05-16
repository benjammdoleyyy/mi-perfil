package com.adrian.mi_perfil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class MiPerfilApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPerfilApplication.class, args);
	}

	@Controller
	class PerfilController {
		@GetMapping("/")
		public String mostrarPerfil() {
			return "index";
		}
	}
}