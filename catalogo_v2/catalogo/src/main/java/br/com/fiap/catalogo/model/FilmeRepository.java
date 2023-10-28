package br.com.fiap.catalogo.model;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.catalogo.model.entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {

    Page<Filme> findAllByAtivoTrue(Pageable paginacao);
}
