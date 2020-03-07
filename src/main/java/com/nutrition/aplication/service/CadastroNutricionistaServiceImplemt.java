package com.nutrition.aplication.service;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nutrition.aplication.datasource.model.Nutricionista;
import com.nutrition.aplication.exception.NutricionistaResourceException;
import com.nutrition.aplication.repository.NutricionistaRepository;
import com.nutrition.aplication.resource.model.NutricionistaResource;

@Service
public class CadastroNutricionistaServiceImplemt {
	
	private static final Logger LOG = Logger.getLogger(CadastroNutricionistaServiceImplemt.class);
	
	@Autowired
	private NutricionistaRepository nutricionistaRepository;
	
	@Autowired
	private NutricionistaConversor service;
	
	
	public void cadastro(NutricionistaResource nutricionistaResource) {
		
		Nutricionista nutricionista = null;
		try {
			nutricionista = service
				.conversor(nutricionistaResource);
			nutricionistaRepository.saveAndFlush(nutricionista);
			
		} catch (NutricionistaResourceException e) {			
			LOG.error("Erro ao salvar o nutricionista: " + e.getMessage(), e);;
		}		
	}
}
