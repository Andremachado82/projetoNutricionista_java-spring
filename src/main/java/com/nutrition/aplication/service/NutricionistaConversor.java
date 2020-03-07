package com.nutrition.aplication.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.nutrition.aplication.datasource.model.Nutricionista;
import com.nutrition.aplication.exception.NutricionistaResourceException;
import com.nutrition.aplication.resource.model.NutricionistaResource;

@Component
public class NutricionistaConversor {
	
	public Nutricionista conversor(
			NutricionistaResource nutricionistaResource) 
				throws NutricionistaResourceException {
		
		try {			
			Nutricionista nutricionista = new Nutricionista();			
			Long idPaciente = checkIdPaciente(
					nutricionistaResource.getIdPaciente());
			
			LocalDate idade = checkIdade(nutricionistaResource.getIdade());
			nutricionista.setIdPaciente(idPaciente);
			nutricionista.setIdade(idade);
			nutricionista.setCodigoRegistro(nutricionistaResource.getCodigoRegistro());
			nutricionista.setNome(nutricionistaResource.getNome());
			
			return nutricionista;

		} catch (Exception e) {
			throw new NutricionistaResourceException(
					"falha ao converter o resource para a entidade, resource: " + nutricionistaResource);
		}
	}
	
	private Long checkIdPaciente(String idPaciente) {
		return Long.parseLong(idPaciente);
	}
	
	private LocalDate checkIdade(String idade) {
		return LocalDate.parse(idade);
	}
}
