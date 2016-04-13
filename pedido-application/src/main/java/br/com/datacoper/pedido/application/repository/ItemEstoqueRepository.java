package br.com.datacoper.pedido.application.repository;

import gumga.framework.domain.repository.GumgaCrudRepository;
import br.com.datacoper.pedido.domain.model.ItemEstoque;

public interface ItemEstoqueRepository extends GumgaCrudRepository<ItemEstoque, Long> {
}