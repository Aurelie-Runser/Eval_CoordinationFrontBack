package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dtos.CommandeDTO;
// import com.example.demo.entity.Commande;
import com.example.demo.services.CommandeService;

@RestController
@RequestMapping("/commandes")
public class CommandesController {

	private CommandeService commandeService;
	
	public CommandesController(CommandeService commandeService) {
		super();
		this.commandeService = commandeService;
	}
	
	//get all
	@GetMapping
	public List<CommandeDTO> getAll() {
		return commandeService.getAll();
	}
	
	// get by id
	@GetMapping("/{id}")
	public CommandeDTO getById(@PathVariable("id") int id) {
		return commandeService.getById(id);
	}

	
}
