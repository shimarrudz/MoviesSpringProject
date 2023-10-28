package br.com.fiap.catalogo.model.dto;

import br.com.fiap.catalogo.model.entity.Genero;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroFilme(
		@NotBlank 
		String titulo,
		@NotBlank
		String ator,
		@NotBlank
		@Pattern(regexp = "\\d{2,3}")
		String duracao,
		@NotBlank
		@Pattern(regexp = "\\d{4}")
		String lancamento,
		@NotBlank
		String pais,
		@NotNull
		Genero genero,
		@NotNull
		@Valid
		DadosFicha ficha
	) {
}
