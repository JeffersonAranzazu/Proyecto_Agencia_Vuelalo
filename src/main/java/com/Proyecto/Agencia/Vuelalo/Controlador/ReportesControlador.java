package com.Proyecto.Agencia.Vuelalo.Controlador;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class ReportesControlador {
	
	
	
	@GetMapping("/reportes")
	public String mostrarReportes(Model model) {
		return "reportes";
	}
	

	
}
