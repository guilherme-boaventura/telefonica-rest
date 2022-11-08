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

import br.com.boaventura.api.datasource.model.Produto;
import br.com.boaventura.api.repository.ProdutoRepository;

@RestController
@RequestMapping(value="/api/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping(path="/produto-id/{}")
	public ResponseEntity<Optional<Produto>> buscarProdutoPorId(@PathVariable(name="id", required = true)Long id) {
		return ResponseEntity.ok(produtoRepository.findById(id));
	}
	
	@GetMapping(path="/todos-produtos")
	public List<Produto> obterTodosProdutos() {
		return produtoRepository.findAll();
	}
	
	@PostMapping(path="/salvar-produto")
	public void salvarProduto(@RequestBody Produto produto) {
		produtoRepository.save(produto);
	}
}
