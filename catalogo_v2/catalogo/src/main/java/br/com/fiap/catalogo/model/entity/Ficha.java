package br.com.fiap.catalogo.model.entity;

import br.com.fiap.catalogo.model.dto.DadosFicha;
import jakarta.persistence.Embeddable;

@Embeddable
public class Ficha {

	private String direcao;
	private String elenco;
	private String roteiro;
	private String classificacao;
	private String producao;
	
	public Ficha() {}
	
	public Ficha(DadosFicha ficha) {
		this.direcao = ficha.direcao();
		this.elenco = ficha.elenco();
		this.roteiro = ficha.roteiro();
		this.classificacao = ficha.classificacao();
		this.producao = ficha.producao();
	}

	public void atualizarInformacoes(DadosFicha dados) {
		if (dados.direcao() != null) {
			this.direcao = dados.direcao();
		}
		if (dados.elenco() != null) {
			this.elenco = dados.elenco();
		}
		if (dados.roteiro() != null) {
			this.roteiro = dados.roteiro();
		}
		if (dados.classificacao() != null) {
			this.classificacao = dados.classificacao();
		}
		if (dados.producao() != null) {
			this.producao = dados.producao();
		}
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getElenco() {
		return elenco;
	}

	public void setElenco(String elenco) {
		this.elenco = elenco;
	}

	public String getRoteiro() {
		return roteiro;
	}

	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public String getProducao() {
		return producao;
	}

	public void setProducao(String producao) {
		this.producao = producao;
	}
	
}
