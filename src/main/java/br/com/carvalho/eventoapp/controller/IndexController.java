package br.com.carvalho.eventoapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.carvalho.eventoapp.model.Evento;
import br.com.carvalho.eventoapp.repository.EventoRepository;

@Controller
public class IndexController {
	
	@Autowired
	private EventoRepository eventoRepository;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index.html");
		Iterable<Evento> eventos = eventoRepository.findAll();
		modelAndView.addObject("eventos", eventos);
		return modelAndView;
	}
}
