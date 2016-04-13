package br.com.datacoper.pedido.application.repository;

import gumga.framework.domain.repository.GumgaCrudRepository;
import br.com.datacoper.pedido.domain.model.Categoria;

public interface CategoriaRepository extends GumgaCrudRepository<Categoria, Long> {
}