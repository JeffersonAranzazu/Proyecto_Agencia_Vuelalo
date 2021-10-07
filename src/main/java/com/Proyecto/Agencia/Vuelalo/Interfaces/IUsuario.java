package com.Proyecto.Agencia.Vuelalo.Interfaces;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Proyecto.Agencia.Vuelalo.Model.UsuarioModel;

@Repository
public interface IUsuario extends CrudRepository<UsuarioModel, String>{

	@Query(value="select * from tabla_Usuarios where usuario=:usuario and clave_Usuario=:clave", nativeQuery = true)
	UsuarioModel findByUsuarioAndPassword(String usuario, String clave);
}


