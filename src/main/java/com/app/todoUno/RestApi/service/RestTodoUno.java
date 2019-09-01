package com.app.todoUno.RestApi.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.app.todoUno.RestApi.model.Products;

public class RestTodoUno {
	
	public static void main(String[] args) {
		Products products = new Products();
		products.setNombreProducto("sergio");
		products.setCantidad(12);
		products.setCategoria("adultos");
		products.setPrecio(123123);
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("TodoUno");
		System.out.println(emf);
		EntityManager em = emf.createEntityManager();
		List<Products> lista=em.createQuery("select p from Products p",Products.class).getResultList();
		for(Products p :lista) {
		System.out.println(p.getNombreProducto());
		System.out.println(p.getCategoria());
		}
		em.close();
		
	}

}
