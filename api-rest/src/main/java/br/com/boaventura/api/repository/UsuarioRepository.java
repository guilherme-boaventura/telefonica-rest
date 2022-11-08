package br.com.boaventura.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.boaventura.api.datasource.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
