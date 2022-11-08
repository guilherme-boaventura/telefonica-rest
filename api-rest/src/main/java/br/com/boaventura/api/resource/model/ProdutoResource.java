package br.com.boaventura.api.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProdutoResource {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("valor")
	private Float valor;
	
	public ProdutoResource(Long id, Float valor) {
		this.id = id;
		this.valor = valor;
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
}
