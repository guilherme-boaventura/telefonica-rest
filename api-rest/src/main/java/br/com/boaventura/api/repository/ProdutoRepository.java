package br.com.boaventura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boaventura.api.datasource.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
