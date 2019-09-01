package com.app.todoUno.RestApi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Products {

	@Id
	@Type(type = "objectid")
	private String id;
	
	private String nombreProducto;
	
	private Integer precio;

	private String categoria;
	
	private Integer cantidad;
	
	public Products() {
		super();
	}
	
	public Products(String nombreProducto, Integer precio, String categoria,Integer cantidad) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.categoria = categoria;
		this.cantidad = cantidad;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Integer getPrecio() {
		return precio;
	}
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
