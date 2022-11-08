package br.com.boaventura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.boaventura.api.datasource.model.TV;

public interface TVRepository extends JpaRepository<TV, Long>{

}
