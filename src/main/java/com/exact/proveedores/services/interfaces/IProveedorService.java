package com.exact.proveedores.services.interfaces;


import com.exact.proveedores.entity.Proveedor;

public interface IProveedorService {

	public Iterable<Proveedor> listarAll();
	public Proveedor listarById(Long id);
	public Proveedor guardar (Proveedor proveedor);
}

