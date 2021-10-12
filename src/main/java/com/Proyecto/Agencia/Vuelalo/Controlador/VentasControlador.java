package com.Proyecto.Agencia.Vuelalo.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Proyecto.Agencia.Vuelalo.Interfaces.Service.IClienteService;
import com.Proyecto.Agencia.Vuelalo.Interfaces.Service.IFacturaService;
import com.Proyecto.Agencia.Vuelalo.Interfaces.Service.IProductoService;
import com.Proyecto.Agencia.Vuelalo.Interfaces.Service.IUsuarioService;
import com.Proyecto.Agencia.Vuelalo.Model.FacturaModel;



@Controller
@RequestMapping
public class VentasControlador {

	@Autowired
	private IUsuarioService serviceUsuario;
	@Autowired // nueva instancia de IClienteService
	private IClienteService serviceCliente;
	@Autowired
	private IProductoService serviceProducto;
	@Autowired
	private IFacturaService serviceFactura;
	
	
	@GetMapping("/mostrarFormVentas")
	public String mostarFormVentas(Model model) {
		model.addAttribute("usuarios",serviceUsuario.listarUsuarios());
		model.addAttribute("clientes",serviceCliente.listarClientes());
		model.addAttribute("productos",serviceProducto.listarProductos());
		return "ventas2.html";
	}
	
	@PostMapping("/saveFactura")
	public String saveFactura (FacturaModel f, Model model) {
		serviceFactura.saveFactura(f);
		return "redirect:/mostrarFormVentas";
	}
	
	
	
	
}
