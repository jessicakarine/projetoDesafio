package com.projetoDesafio.home;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoDesafio.home.model.Apartamento;
import com.projetoDesafio.home.repositorio.ApartamentoRepository;

@RestController
@RequestMapping("/gestaoapt")
public class GestaoApartamentoController {

	@Autowired
	private ApartamentoRepository apartamentos;

	@PostMapping()
	public Apartamento adicionar(@Valid @RequestBody Apartamento apartamento) {
		return apartamentos.save(apartamento);
	}

	@DeleteMapping()
	public Apartamento deletar(@RequestBody Apartamento apartamento) {
		apartamentos.delete(apartamento);
		return apartamento;
	}

}
