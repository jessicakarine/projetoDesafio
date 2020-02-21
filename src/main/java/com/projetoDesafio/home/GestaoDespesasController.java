package com.projetoDesafio.home;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoDesafio.home.model.Despesa;
import com.projetoDesafio.home.repositorio.DespesaRepository;

@RestController
@RequestMapping("/gestaodespesa")
public class GestaoDespesasController {

	@Autowired
	private DespesaRepository despesas;

	@PostMapping()
	public Despesa adicionar(@Valid @RequestBody Despesa despesa) {
		return despesas.save(despesa);

	}

	@DeleteMapping()
	public Despesa deletar(@RequestBody Despesa despesa) {
		despesas.delete(despesa);
		return despesa;
	}

}
