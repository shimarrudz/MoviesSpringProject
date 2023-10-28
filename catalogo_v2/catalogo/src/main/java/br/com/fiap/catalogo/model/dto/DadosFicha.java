package br.com.fiap.catalogo.model.dto;

import jakarta.validation.constraints.NotBlank;

public record DadosFicha(
		@NotBlank
		String direcao,
		@NotBlank
		String elenco,
		@NotBlank
		String roteiro,
		String classificacao,
		@NotBlank
		String producao
	) {
}
