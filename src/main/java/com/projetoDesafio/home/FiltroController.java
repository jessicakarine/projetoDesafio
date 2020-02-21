package com.projetoDesafio.home;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.projetoDesafio.home.model.Despesa;

@RestController
//@RequestMapping("/contato")
public class FiltroController {

//	private Despesas despesas;

	@RequestMapping(value = "/despesas/{id}/{nome}/{mesAno}/{ano}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<Despesa> filtrarValores(@RequestParam(required = false, name = "id") Integer id,
			@RequestParam(required = false, name = "nome") String nome,
			@RequestParam(required = false, name = "mesAno") String mesAno,
			@RequestParam(required = false, name = "ano") String ano) {

		FiltroValidador.validade(id, nome, mesAno, ano);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
