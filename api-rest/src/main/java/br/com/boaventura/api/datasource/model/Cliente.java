package br.com.boaventura.api.datasource.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Cliente extends Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6580762809088879115L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable=false)
	private Long id;
	
	private LocalDate nascimento;
	//private List<Produto> produtos = new ArrayList<Produto>();
	
	public Cliente() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(String nascimento) {
		this.nascimento = LocalDate.of(Integer.parseInt(nascimento.substring(0, 4)), Integer.parseInt(nascimento.substring(5, 7)), Integer.parseInt(nascimento.substring(8, 10)));
	}
}
