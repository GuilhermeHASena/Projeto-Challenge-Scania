package br.com.scania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UsuarioController {
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView modelView = new ModelAndView("/login");
		return modelView;
	}
	
	@GetMapping("/criar-conta")
	public ModelAndView criarConta() {
		ModelAndView modelView = new ModelAndView("/criar-conta");
		return modelView;
	}
}
