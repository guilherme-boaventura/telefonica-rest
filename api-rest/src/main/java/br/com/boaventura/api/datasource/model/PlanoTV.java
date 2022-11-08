package br.com.boaventura.api.datasource.model;

public enum PlanoTV {
	
	TOTAL(3L, "Total", 144F), 
	MIX(2L, "Mix", 99F), 
	START(1L, "Start", 79F);

	private Long id;
	private String nome;
	private Float valor;
	
	PlanoTV(Long id, String nome, Float valor) {
		this.setId(id);
		this.setNome(nome);
		this.setValor(valor);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public Float getValor() {
		return valor;
	}

	public void setValor(Float valor) {
		this.valor = valor;
	}
	
}
