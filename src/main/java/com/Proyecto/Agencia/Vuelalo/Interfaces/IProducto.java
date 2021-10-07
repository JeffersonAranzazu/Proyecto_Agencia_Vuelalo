package com.Proyecto.Agencia.Vuelalo.Interfaces;

import org.springframework.data.repository.CrudRepository;

import com.Proyecto.Agencia.Vuelalo.Model.ProductoModel;

public interface IProducto extends CrudRepository<ProductoModel, String> {

}
