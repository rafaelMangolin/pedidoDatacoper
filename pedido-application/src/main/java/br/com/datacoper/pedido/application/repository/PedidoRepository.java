package br.com.datacoper.pedido.application.repository;

import gumga.framework.domain.repository.GumgaCrudRepository;
import br.com.datacoper.pedido.domain.model.Pedido;

public interface PedidoRepository extends GumgaCrudRepository<Pedido, Long> {
}