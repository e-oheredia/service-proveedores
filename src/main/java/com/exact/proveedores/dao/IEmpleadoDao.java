package com.exact.proveedores.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.proveedores.entity.Empleado;

@Repository
public interface IEmpleadoDao extends CrudRepository<Empleado, Long> {
	public Empleado findByMatricula(String matricula);
}
