package br.com.boaventura.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;import br.com.boaventura.api.datasource.model.Cliente;
import br.com.boaventura.api.repository.ClienteRepository;

@RestController
@RequestMapping(value="/api/cliente")
public class ClienteController {

	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping(path="/cliente-id/{}")
	public ResponseEntity<Optional<Cliente>> buscarClientePorId(@PathVariable(name="id", required = true)Long id) {
		return ResponseEntity.ok(clienteRepository.findById(id));
	}
	
	@GetMapping(path="/todos-clientes")
	public List<Cliente> obterTodosClientes() {
		return clienteRepository.findAll();
	}
	
	@PostMapping(path="/salvar-cliente")
	public void salvarCliente(@RequestBody Cliente cliente) {
		clienteRepository.save(cliente);
	}
}
