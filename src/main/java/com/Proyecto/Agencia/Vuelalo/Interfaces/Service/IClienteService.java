package com.Proyecto.Agencia.Vuelalo.Interfaces.Service;

import java.util.List;
import java.util.Optional;

import com.Proyecto.Agencia.Vuelalo.Model.ClienteModel;


public interface IClienteService {
	
	public List<ClienteModel> listarClientes();
	public Optional<ClienteModel> listarIdCliente(String Cedula);
	public int saveCliente (ClienteModel c);	
	public void deleteCliente (String cedula);
}
