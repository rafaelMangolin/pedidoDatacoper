package br.com.datacoper.pedido.application.repository;

import gumga.framework.domain.repository.GumgaCrudRepository;
import br.com.datacoper.pedido.domain.model.Pessoa;

public interface PessoaRepository extends GumgaCrudRepository<Pessoa, Long> {
}