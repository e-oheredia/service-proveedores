package com.exact.proveedores.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tipo_proveedor")
public class TipoProveedor implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tipo_proveedor_id")
	private Long id;
	
	private String descripcion;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoproveedor")
	@JsonIgnore
	private Set<Proveedor> proveedor;
		

	public Set<Proveedor> getProveedor() {
		return proveedor;
	}

	public void setProveedor(Set<Proveedor> proveedor) {
		this.proveedor = proveedor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
