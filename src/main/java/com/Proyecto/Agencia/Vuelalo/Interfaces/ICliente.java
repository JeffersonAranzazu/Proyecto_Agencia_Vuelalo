package com.Proyecto.Agencia.Vuelalo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Proyecto.Agencia.Vuelalo.Model.ClienteModel;


@Repository
public interface ICliente extends CrudRepository<ClienteModel, String> {

}
