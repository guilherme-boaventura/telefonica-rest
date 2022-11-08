package br.com.boaventura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.boaventura.api.datasource.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
