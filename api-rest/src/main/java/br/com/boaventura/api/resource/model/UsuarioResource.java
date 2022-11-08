package br.com.boaventura.api.resource.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioResource {
	
	@JsonProperty("id_usuario")
	private Long id;
	
	@JsonProperty("login_usuario")
	private String login;
	
	@JsonProperty("senha_usuario")
	private String senha;

	@JsonProperty("nome_usuario")
	private String nome;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
