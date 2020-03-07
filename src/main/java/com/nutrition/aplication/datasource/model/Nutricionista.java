package com.nutrition.aplication.datasource.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="nutricionista")
public class Nutricionista implements Serializable {
	
	private static final long serialVersionUID = 2710407271748466736L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="nome")
	private String nome;
	private LocalDate idade;
	
	@Column(name ="codigo_registro")
	private String codigoRegistro;
	
	@Column(name ="id_paciente")
	private Long idPaciente;
		
	public Nutricionista() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}	

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}	

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getIdade() {
		return idade;
	}
	public void setIdade(LocalDate idade) {
		this.idade = idade;
	}
	
//	private LocalDate format(LocalDate idade2) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	
	public Long getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(Long idPaciente) {
		this.idPaciente = idPaciente;
	}	

}
