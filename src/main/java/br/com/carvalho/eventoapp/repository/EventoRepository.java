package br.com.carvalho.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.carvalho.eventoapp.model.Evento;

public interface EventoRepository extends CrudRepository<Evento,String>{

	Evento findByCodigo(long codigo);

}
