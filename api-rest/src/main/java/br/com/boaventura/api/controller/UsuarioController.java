package br.com.boaventura.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.boaventura.api.datasource.model.Usuario;
import br.com.boaventura.api.repository.UsuarioRepository;

@RestController
@RequestMapping(value="/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping(path="/todos-usuarios")
	public List<Usuario> todosClientes() {
		return usuarioRepository.findAll();
	}

	@PostMapping(path="/salvar-usuario")
	public void salvarUsuario(@RequestBody Usuario usuario) {
		usuarioRepository.save(usuario);
	}
}
