package com.Proyecto.Agencia.Vuelalo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Proyecto.Agencia.Vuelalo.Interfaces.IReportes;
import com.Proyecto.Agencia.Vuelalo.Interfaces.Service.IReporteService;
import com.Proyecto.Agencia.Vuelalo.Model.ReportesModel;

@Service
public class ReportesService implements IReporteService {

	@Autowired
	private IReportes reportesdb;
	
	@Override
	public List<ReportesModel> listarVentasClientes(){
		return (List<ReportesModel>) reportesdb.findAll();
	}
}
