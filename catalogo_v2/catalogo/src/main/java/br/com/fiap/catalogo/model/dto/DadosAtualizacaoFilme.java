package br.com.fiap.catalogo.model.dto;

import br.com.fiap.catalogo.model.entity.Genero;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosAtualizacaoFilme(
        @NotNull
        Long id,
        String titulo,
        String ator,
        @Pattern(regexp = "\\d{2,3}")
        String duracao,
        @Pattern(regexp = "\\d{4}")
        String lancamento,
        String pais,
        Genero genero,
        DadosFicha ficha
) {
}
