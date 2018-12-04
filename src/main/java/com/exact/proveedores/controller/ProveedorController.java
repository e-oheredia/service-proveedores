package com.exact.proveedores.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.exact.proveedores.entity.Proveedor;
import com.exact.proveedores.services.interfaces.IProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {
	
	@Autowired
	IProveedorService proveedorservice;
	
	@GetMapping
	public ResponseEntity<Iterable<Proveedor>> listarAll() {
		return new ResponseEntity<Iterable<Proveedor>>(proveedorservice.listarAll(), HttpStatus.OK);
	}

}
