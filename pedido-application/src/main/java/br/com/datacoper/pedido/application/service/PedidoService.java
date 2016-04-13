package br.com.datacoper.pedido.application.service;

import gumga.framework.application.GumgaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.datacoper.pedido.application.repository.PedidoRepository;
import br.com.datacoper.pedido.domain.model.Pedido;

import br.com.datacoper.pedido.domain.model.ItemPedido;

@Service
public class PedidoService extends GumgaService<Pedido, Long> {

	private final PedidoRepository repository;

	@Autowired
	public PedidoService(PedidoRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
	@Transactional
	public Pedido loadPedidoFat(Long id) {
		Pedido obj = repository.findOne(id);	
		
		Hibernate.initialize(obj.getItensPedido());
		Hibernate.initialize(obj.getItensPedido());
		
		
		return obj;
	}
}
