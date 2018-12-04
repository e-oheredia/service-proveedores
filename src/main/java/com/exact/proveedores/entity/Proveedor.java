package com.exact.proveedores.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="proveedor")
public class Proveedor implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="proveedor_id")
	private Long id;
		
	private String nombre;
	
	@ManyToOne(optional=false)
	@JoinColumn(name="tipo_proveedor_id")
	private TipoProveedor tipoproveedor;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoProveedor getTipoproveedor() {
		return tipoproveedor;
	}

	public void setTipoproveedor(TipoProveedor tipoproveedor) {
		this.tipoproveedor = tipoproveedor;
	}
	
}
