package com.nutrition.aplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nutrition.aplication.datasource.model.Nutricionista;

public interface NutricionistaRepository 
	extends JpaRepository<Nutricionista, Long>{	

}
