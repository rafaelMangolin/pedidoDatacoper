package br.com.datacoper.pedido.application.service;

import gumga.framework.application.GumgaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;

import br.com.datacoper.pedido.application.repository.PessoaRepository;
import br.com.datacoper.pedido.domain.model.Pessoa;

import br.com.datacoper.pedido.domain.model.Papel;

@Service
public class PessoaService extends GumgaService<Pessoa, Long> {

	private final PessoaRepository repository;

	@Autowired
	public PessoaService(PessoaRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
	@Transactional
	public Pessoa loadPessoaFat(Long id) {
		Pessoa obj = repository.findOne(id);	
		
		Hibernate.initialize(obj.getPapeis());
		
		
		return obj;
	}
}
