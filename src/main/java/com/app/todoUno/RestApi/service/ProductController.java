package com.app.todoUno.RestApi.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.app.todoUno.RestApi.model.Products;

@Path("productos")

public class ProductController {
	
	
	
	@POST
	@Path("/producto")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Products validar(Products pd) {
		pd.setNombreProducto("carrito");
		if(pd.getNombreProducto().equals("carrito") && pd.getCantidad().equals(2)) {
			pd.setNombreProducto("carrito");
		}
		pd.setCategoria("xxx");
		return pd;
	}
	
	
	

}
