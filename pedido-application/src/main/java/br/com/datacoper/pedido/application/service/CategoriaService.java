package br.com.datacoper.pedido.application.service;

import gumga.framework.application.GumgaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.datacoper.pedido.application.repository.CategoriaRepository;
import br.com.datacoper.pedido.domain.model.Categoria;


@Service
public class CategoriaService extends GumgaService<Categoria, Long> {

	private final CategoriaRepository repository;

	@Autowired
	public CategoriaService(CategoriaRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
}
