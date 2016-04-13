package br.com.datacoper.pedido.application.service;

import gumga.framework.application.GumgaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.datacoper.pedido.application.repository.ItemPedidoRepository;
import br.com.datacoper.pedido.domain.model.ItemPedido;


@Service
public class ItemPedidoService extends GumgaService<ItemPedido, Long> {

	private final ItemPedidoRepository repository;

	@Autowired
	public ItemPedidoService(ItemPedidoRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
}
