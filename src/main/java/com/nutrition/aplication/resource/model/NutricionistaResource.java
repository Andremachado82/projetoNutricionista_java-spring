package com.nutrition.aplication.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NutricionistaResource {
	
	@JsonProperty("nome_nutricionista")
	private String nome;
	
	@JsonProperty("nascimento")
	private String nascimento;
	
	@JsonProperty("codigo_registro")
	private String codigoRegistro;	
	
	@JsonProperty("id_paciente")
	private String idPaciente;		
	
	public NutricionistaResource(String nome, String idPaciente ) {	
		this.nome = nome;
		this.idPaciente = idPaciente;		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNascimento() {
//		???
		return nascimento;
	}
	
	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getIdPaciente() {
		return idPaciente;
	}
	
	public void setIdPaciente(String idPaciente) {
		this.idPaciente = idPaciente;
	}
	
	public String getCodigoRegistro() {
		return codigoRegistro;
	}
	
	public void setCodigoRegistro(String codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	@Override
	public String toString() {
		return "NutricionistaResource [nome=" + nome + ", nascimneto=" + nascimento + ", codigoRegistro=" + codigoRegistro
				+ ", idPaciente=" + idPaciente + "]";
	}
	
	

}

