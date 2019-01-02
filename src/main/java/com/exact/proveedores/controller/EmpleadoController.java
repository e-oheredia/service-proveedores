package com.exact.proveedores.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exact.proveedores.entity.Empleado;
import com.exact.proveedores.services.interfaces.IEmpleadoService;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
	
	@Autowired
	IEmpleadoService empleadoService;
	
	@GetMapping
	public ResponseEntity<Empleado> listarByMatricula(@RequestParam String matricula) throws IOException {
			Empleado empleado = empleadoService.listarByMatricula(matricula);
		return new ResponseEntity<Empleado>(empleado, empleado == null ? HttpStatus.NOT_FOUND : HttpStatus.OK);
	}
	
}
