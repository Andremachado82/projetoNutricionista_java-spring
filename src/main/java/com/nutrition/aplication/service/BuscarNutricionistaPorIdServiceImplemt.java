package com.nutrition.aplication.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.aplication.datasource.model.Nutricionista;
import com.nutrition.aplication.exception.NutricionistaNotFoundException;
import com.nutrition.aplication.repository.NutricionistaRepository;

@Service
public class BuscarNutricionistaPorIdServiceImplemt {
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	public Nutricionista buscarPorId(Long id) throws NutricionistaNotFoundException {
		Optional<Nutricionista> optionalNutricionista = getOptional(id);
		
		Nutricionista nutricionista = null;
		if(!optionalNutricionista.isPresent()) {
			throw new NutricionistaNotFoundException(
					"Nutricionista não encontrado através do ID: " + id);
		} else {
			nutricionista = optionalNutricionista.get();
		}
		return nutricionista;
	}

	private Optional<Nutricionista> getOptional(Long id) {
		Optional<Nutricionista> optionalNutricionista = nutricionistaRepository
				.findById(id);
		return optionalNutricionista;
	}
	
	public void deletarPorId(Long id) throws NutricionistaNotFoundException {
		
		Optional<Nutricionista> optionalNutricionista = getOptional(id);
		if(!optionalNutricionista.isPresent()) {
			throw new NutricionistaNotFoundException(
					"Nutricionista não encontrado através do ID: " + id);
		} else {
			nutricionistaRepository.delete(optionalNutricionista.get());
		}		
	}
}
