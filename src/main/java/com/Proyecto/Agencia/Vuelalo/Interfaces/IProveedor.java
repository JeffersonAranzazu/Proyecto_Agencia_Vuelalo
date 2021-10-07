package com.Proyecto.Agencia.Vuelalo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Proyecto.Agencia.Vuelalo.Model.ProveedorModel;


@Repository
public interface IProveedor extends CrudRepository<ProveedorModel, String> {

}
