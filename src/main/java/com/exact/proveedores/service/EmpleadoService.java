package com.exact.proveedores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exact.proveedores.dao.IEmpleadoDao;
import com.exact.proveedores.entity.Empleado;
import com.exact.proveedores.services.interfaces.IEmpleadoService;

@Service
public class EmpleadoService implements IEmpleadoService {
	
	@Autowired
	IEmpleadoDao empleadoDao;

	@Override
	public Empleado listarByMatricula(String matricula) {
		return empleadoDao.findByMatricula(matricula);
	}

}
