package com.exact.proveedores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.exact.proveedores.dao.IProveedorDao;
import com.exact.proveedores.entity.Proveedor;
import com.exact.proveedores.services.interfaces.IProveedorService;

@Service
public class ProveedorService implements IProveedorService{

	@Autowired
	IProveedorDao proveedordao;
	
	@Override
	public Iterable<Proveedor> listarAll() {
		return proveedordao.findAll();
	}
	
	@Override
	public Proveedor listarById(Long id) {
		return proveedordao.findById(id).orElse(null);
	}

}
