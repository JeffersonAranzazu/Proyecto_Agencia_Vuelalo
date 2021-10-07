package com.Proyecto.Agencia.Vuelalo.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.Proyecto.Agencia.Vuelalo.Model.UsuarioModel;

public interface IUsuarioService {

	public boolean validarUsuario(String Usuario, String Clave);
	public List<UsuarioModel> listarUsuarios();
	public Optional<UsuarioModel> listarIdUsuario(String Cedula);
	public int saveUsuario (UsuarioModel u);	
	public void deleteUsuario (String cedula);
	
}
