package com.projetoDesafio.home;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoDesafio.home.model.Proprietario;
import com.projetoDesafio.home.repositorio.ProprietarioRepository;

@RestController
@RequestMapping("/gestaoproprietario")
public class GestaoProprietarioController {

	private ProprietarioRepository proprietarios;
	
	@Autowired
	public GestaoProprietarioController(ProprietarioRepository proprietarios) {
		this.proprietarios = proprietarios;
	}

	@PostMapping()
	public Proprietario adicionar(@Valid @RequestBody Proprietario proprietario) {
		return proprietarios.save(proprietario);

	}

	@DeleteMapping()
	public Proprietario deletar(@RequestBody Proprietario proprietario) {
		proprietarios.delete(proprietario);
		return proprietario;
	}

}
