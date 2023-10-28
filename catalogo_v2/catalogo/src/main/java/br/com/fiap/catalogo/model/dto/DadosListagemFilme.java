package br.com.fiap.catalogo.model.dto;

import br.com.fiap.catalogo.model.entity.Filme;
import br.com.fiap.catalogo.model.entity.Genero;

public record DadosListagemFilme(
        Long id,
        String titulo,
        String ator,
        String duracao,
        Genero genero,
        String direcao
) {

    public DadosListagemFilme(Filme filme) {
        this(
                filme.getId(),
                filme.getTitulo(),
                filme.getAtor(),
                filme.getDuracao(),
                filme.getGenero(),
                filme.getFicha().getDirecao()
        );
    }
}