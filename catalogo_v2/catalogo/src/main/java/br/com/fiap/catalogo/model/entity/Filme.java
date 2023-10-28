package br.com.fiap.catalogo.model.entity;

import br.com.fiap.catalogo.model.dto.DadosAtualizacaoFilme;
import br.com.fiap.catalogo.model.dto.DadosCadastroFilme;
import br.com.fiap.catalogo.model.dto.DadosFicha;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "filmes")
@Entity(name = "Filme")
public class Filme {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private String ator;
	private String duracao;
	private String lancamento;
	private String pais;
	
	@Enumerated(EnumType.STRING)
	private Genero genero;
	
	@Embedded
	private Ficha ficha;
	private Boolean ativo;
	
	public Filme() {}
	
	public Filme(DadosCadastroFilme dados) {
		this.ativo = true;
		this.titulo = dados.titulo();
		this.ator = dados.ator();
		this.duracao = dados.duracao();
		this.lancamento = dados.lancamento();
		this.pais = dados.pais();
		this.genero = dados.genero();
		this.ficha = new Ficha(dados.ficha());
	}

	public void atualizarInformacoes(DadosAtualizacaoFilme dados) {
		if (dados.titulo() != null) {
			this.titulo = dados.titulo();
		}
		if (dados.ator() != null) {
			this.ator = dados.ator();
		}
		if (dados.duracao() != null) {
			this.duracao = dados.duracao();
		}
		if (dados.lancamento() != null) {
			this.lancamento = dados.lancamento();
		}
		if (dados.pais() != null) {
			this.pais = dados.pais();
		}
		if (dados.genero() != null) {
			this.genero = dados.genero();
		}
		if (dados.ficha() != null) {
			this.ficha.atualizarInformacoes(dados.ficha());
		}
	}

	public void excluir() {
		this.ativo = false;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAtor() {
		return ator;
	}

	public void setAtor(String ator) {
		this.ator = ator;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getLancamento() {
		return lancamento;
	}

	public void setLancamento(String lancamento) {
		this.lancamento = lancamento;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Ficha getFicha() {
		return ficha;
	}

	public void setFicha(Ficha ficha) {
		this.ficha = ficha;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
}
