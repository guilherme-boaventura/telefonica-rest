package br.com.boaventura.api.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import br.com.boaventura.api.datasource.model.PlanoTV;

public class TVResource {

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("valor")
	private Float valor;
	
	@JsonProperty("plano")
	private String plano;
	
	public TVResource(Long id, Float valor, String plano) {
		this.id = id;
		this.valor = valor;
		this.plano = plano;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Float getValor() {
		return valor;
	}
	
	public void setValor(Float valor) {
		this.valor = valor;
	}

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}
}

