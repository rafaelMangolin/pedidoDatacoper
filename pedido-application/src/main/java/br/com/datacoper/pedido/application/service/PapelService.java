package br.com.datacoper.pedido.application.service;

import gumga.framework.application.GumgaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.datacoper.pedido.application.repository.PapelRepository;
import br.com.datacoper.pedido.domain.model.Papel;


@Service
public class PapelService extends GumgaService<Papel, Long> {

	private final PapelRepository repository;

	@Autowired
	public PapelService(PapelRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
}
