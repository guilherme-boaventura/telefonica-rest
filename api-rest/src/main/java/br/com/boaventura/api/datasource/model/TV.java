package br.com.boaventura.api.datasource.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.boaventura.api.business.TVBS;


@Table
@Entity
public class TV extends Produto {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(nullable=false)
	private Long id;
	
	@Column(nullable=false)
	private Float valor;
	
	@Column(nullable=true)
	private String plano;
	
	public TV() {
	}
	
	public TV(String plano) {
		PlanoTV planoTv = TVBS.getInstancia().obterPorNome(plano);
		this.setPlano(planoTv.getNome());
		this.setValor(planoTv.getValor());
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

	public PlanoTV getPlano() {
		return TVBS.getInstancia().obterPorNome(this.plano);
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}
}
