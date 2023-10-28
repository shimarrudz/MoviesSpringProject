package br.com.fiap.catalogo.controller;

import br.com.fiap.catalogo.model.dto.DadosAtualizacaoFilme;
import br.com.fiap.catalogo.model.dto.DadosListagemFilme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import br.com.fiap.catalogo.model.FilmeRepository;
import br.com.fiap.catalogo.model.dto.DadosCadastroFilme;
import br.com.fiap.catalogo.model.entity.Filme;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
	
	@Autowired
	private FilmeRepository repository;
	
	@PostMapping
	@Transactional
	public void cadastrar(@RequestBody @Valid DadosCadastroFilme dados)
	{
		repository.save(new Filme(dados));
	}

	@GetMapping
	public Page<DadosListagemFilme> listar(@PageableDefault(size = 3,
	sort = {"ator"}) Pageable paginacao) {
		return repository.findAllByAtivoTrue(paginacao).map(DadosListagemFilme :: new);
	}

	@PutMapping
	@Transactional
	public void atualizar(@RequestBody @Valid DadosAtualizacaoFilme dados) {
		Filme filme = new Filme();
		filme = repository.getReferenceById(dados.id());
		filme.atualizarInformacoes(dados);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		Filme filme = new Filme();
		filme = repository.getReferenceById(id);
		filme.excluir();
	}

}
