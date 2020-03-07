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
			
			LocalDate nascimento = checkNascimento(nutricionistaResource.getNascimento());
			nutricionista.setIdPaciente(idPaciente);
			nutricionista.setNascimento(nascimento);
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
	
	private LocalDate checkNascimento(String nascimneto) {
		return LocalDate.parse(nascimneto);
	}
}
