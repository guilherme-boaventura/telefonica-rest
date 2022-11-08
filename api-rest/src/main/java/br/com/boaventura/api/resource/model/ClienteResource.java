package br.com.boaventura.api.resource.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ClienteResource {
	
	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("nme")
	private String name;
	
	@JsonProperty("nascimento")
	private LocalDate nascimento;
	
	@JsonProperty("login")
	private String login;
	
	@JsonProperty("senha")
	private String senha;
	
	public ClienteResource(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(String nascimento) {
		this.nascimento = LocalDate.of(Integer.parseInt(nascimento.substring(0, 4)), Integer.parseInt(nascimento.substring(5, 7)), Integer.parseInt(nascimento.substring(8, 10)));
	}
}
