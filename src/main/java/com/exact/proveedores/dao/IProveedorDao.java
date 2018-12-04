package com.exact.proveedores.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exact.proveedores.entity.Proveedor;

@Repository
public interface IProveedorDao  extends CrudRepository<Proveedor, Long>{

	
	
}
