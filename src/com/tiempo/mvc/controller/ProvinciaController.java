package com.tiempo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tiempo.mvc.service.RegistroMeteorologicoService;

@Controller
@RequestMapping("/provincia")
public class ProvinciaController {
	
		
	private RegistroMeteorologicoService service;
	
	
	
	public ProvinciaController() {
		super();
		service= new RegistroMeteorologicoService();
	}

	@RequestMapping(value="list", method=RequestMethod.GET)
	public String listadoProvincias(Model model) {
		
		model.addAttribute("provincias",service.provinciaList());
		return "listadoprovincias";
	}

}
