package com.Proyecto.Agencia.Vuelalo.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class VentasControlador {

	@Autowired
	
	
	
	@GetMapping("/mostrarFormVentas")
	public String mostarFormVentas() {
		return "ventas2.html";
	}
	
	
	
	
}
