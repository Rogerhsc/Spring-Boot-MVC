package br.com.carvalho.eventoapp.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.carvalho.eventoapp.model.Convidado;
import br.com.carvalho.eventoapp.model.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	
	Iterable<Convidado> findByEvento(Evento evento);

}
