package com.nutrition.aplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nutrition.aplication.datasource.model.Nutricionista;
import com.nutrition.aplication.exception.NutricionistaNotFoundException;
import com.nutrition.aplication.resource.model.NutricionistaResource;
import com.nutrition.aplication.service.BuscarNutricionistaPorIdServiceImplemt;
import com.nutrition.aplication.service.BuscarNutricionistasServiceImplement;
import com.nutrition.aplication.service.CadastroNutricionistaServiceImplemt;


@RestController
@RequestMapping(value = "/api")
public class NutricionistaController {	
	
	@Autowired
	private BuscarNutricionistasServiceImplement serviceBuscar;
	
	@Autowired
	private CadastroNutricionistaServiceImplemt serviceCadastro;
	
	@Autowired
	private BuscarNutricionistaPorIdServiceImplemt serviceBuscarPorId;
	
	@GetMapping(path = "/nutricionistas")
	public List<Nutricionista>buscarNutricionistas() {
		return serviceBuscar.buscarTodosNutricionistas();
	}
	
	@GetMapping(path = "/nutricionistas/{id}")
	public Nutricionista buscarNutricionistasPorId(
			@PathVariable (name = "id", required = true) Long id) throws NutricionistaNotFoundException {
		return serviceBuscarPorId.buscarPorId(id);
	}	
	
	@PostMapping(path = "/nutricionistas/save")
	public void salvarNutricionista(
			@RequestBody NutricionistaResource nutricionista) {
		serviceCadastro.cadastro(nutricionista);
	}
	
	@DeleteMapping(path = "nutricionistas/{id}") 
	public void deleteNutricionista(
			@PathVariable(name = "id", required = true ) Long id) throws NutricionistaNotFoundException {
		serviceBuscarPorId.deletarPorId(id);;
	}
}
