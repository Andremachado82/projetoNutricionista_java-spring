package com.nutrition.aplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.aplication.datasource.model.Nutricionista;
import com.nutrition.aplication.repository.NutricionistaRepository;

@Service
public class BuscarNutricionistasServiceImplement{	
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;	
	
	public List<Nutricionista>buscarTodosNutricionistas() {		
		List<Nutricionista> listNutricionista = nutricionistaRepository
				.findAll();
		return listNutricionista;
	}
}
