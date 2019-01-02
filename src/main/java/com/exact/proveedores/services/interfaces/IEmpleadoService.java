package com.exact.proveedores.services.interfaces;

import com.exact.proveedores.entity.Empleado;

public interface IEmpleadoService {
	Empleado listarByMatricula(String matricula);
}
