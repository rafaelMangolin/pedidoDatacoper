package br.com.datacoper.pedido.application.repository;

import gumga.framework.domain.repository.GumgaCrudRepository;
import br.com.datacoper.pedido.domain.model.Produto;

public interface ProdutoRepository extends GumgaCrudRepository<Produto, Long> {
}