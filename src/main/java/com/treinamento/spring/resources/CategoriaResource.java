package com.treinamento.spring.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento.spring.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {

		Categoria c1 = new Categoria( 1, "Informática" );
		Categoria c2 = new Categoria( 2, "Escritório" );
		
		List<Categoria> listCategorias = new ArrayList<>();
		
		listCategorias.add(c1);
		listCategorias.add(c2);
		
		return listCategorias;
		
	}
	
}
