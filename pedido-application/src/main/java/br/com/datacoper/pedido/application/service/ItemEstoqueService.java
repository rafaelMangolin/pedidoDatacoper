package br.com.datacoper.pedido.application.service;

import gumga.framework.application.GumgaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.datacoper.pedido.application.repository.ItemEstoqueRepository;
import br.com.datacoper.pedido.domain.model.ItemEstoque;


@Service
public class ItemEstoqueService extends GumgaService<ItemEstoque, Long> {

	private final ItemEstoqueRepository repository;

	@Autowired
	public ItemEstoqueService(ItemEstoqueRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
}
