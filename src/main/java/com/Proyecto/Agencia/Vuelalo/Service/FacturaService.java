package com.Proyecto.Agencia.Vuelalo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Proyecto.Agencia.Vuelalo.Interfaces.IFactura;
import com.Proyecto.Agencia.Vuelalo.Interfaces.Service.IFacturaService;
import com.Proyecto.Agencia.Vuelalo.Model.FacturaModel;



@Service
public class FacturaService implements IFacturaService {

	@Autowired
	private IFactura facturadb;

	@Override
	public int saveFactura (FacturaModel f) {
		// TODO Auto-generated method stub
		int res =0;
		FacturaModel factura = facturadb.save(f);
		if(!factura.equals(null)) {
			res=1;
		}
		return res;
	}

}