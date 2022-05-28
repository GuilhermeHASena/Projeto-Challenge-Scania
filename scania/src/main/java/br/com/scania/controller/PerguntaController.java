package br.com.scania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PerguntaController {
	
	@GetMapping("/perguntas")
	public ModelAndView carregarPergunta() {
		ModelAndView modelView = new ModelAndView("/pergunta");
		return modelView;
	}
	
	@GetMapping("/modelo")
	public ModelAndView exibirModeloIndicado() {
		ModelAndView modelView = new ModelAndView("/modelo");
		return modelView;
	}
}
