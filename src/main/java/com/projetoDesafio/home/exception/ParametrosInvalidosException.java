package com.projetoDesafio.home.exception;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParametrosInvalidosException extends RuntimeException {

	private static final long serialVersionUID = -1489910150992883349L;
	private Map<String, List<String>> erros;
	
	public ParametrosInvalidosException(String texto) {
		super(texto);
		this.erros = new HashMap<>();
	}

	public Map<String, List<String>> getErros() {
		return erros;
	}

	public void setErros(Map<String, List<String>> erros) {
		this.erros = erros;
	}
}