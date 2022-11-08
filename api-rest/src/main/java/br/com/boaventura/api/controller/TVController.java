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
import org.springframework.web.bind.annotation.RestController;

import br.com.boaventura.api.datasource.model.TV;
import br.com.boaventura.api.repository.TVRepository;

@RestController
@RequestMapping(value="/api/TV")
public class TVController {

	@Autowired
	private TVRepository tvRepository;
	
	@GetMapping(path="/tv-id/{id}")
	public Optional<TV> buscarProdutoPorId(@PathVariable(name="id", required = true)Long id) {
		return tvRepository.findById(id);
	}
	
	@GetMapping(path="/todos-tv")
	public List<TV> obterTodosProdutos() {
		return tvRepository.findAll();
	}
	
	@PostMapping(path="/salvar-tv")
	public void salvarProduto(@RequestBody TV tv) {
		tvRepository.save(tv);
	}
	
}
