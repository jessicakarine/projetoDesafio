package com.projetoDesafio.home;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;

import com.projetoDesafio.home.exception.ParametrosInvalidosException;

@Component
public class FiltroValidador {

	private static final String NULO_OU_VAZIO = "Não deve ser nulo ou vazio.";

	private FiltroValidador() {
		// empty constructor privado para nao instanciar
	}

	public static void validade(Integer id, String nome, String mesAno, String ano) {
		Map<String, List<String>> camposIncorretos = new HashMap<>();

		camposIncorretos.putAll(validationNull(id, nome, mesAno, ano));
		if (!camposIncorretos.isEmpty()) {
			ParametrosInvalidosException ex = new ParametrosInvalidosException("Erro na validação dos campos.");
			ex.setErros(camposIncorretos);
			throw ex;
		}

	}

	public static Map<String, List<String>> validationNull(Integer id, String nome, String mesAno, String ano) {
		Map<String, List<String>> camposNulos = new HashMap<>();

		if (id.equals(null)) {
			camposNulos.put("id", Arrays.asList(NULO_OU_VAZIO, null));
			
		} else if (Strings.isBlank(nome)) {
			camposNulos.put("nome", Arrays.asList(NULO_OU_VAZIO, null));
			
		} else if (Strings.isBlank(mesAno)) {
			camposNulos.put("mesAno", Arrays.asList(NULO_OU_VAZIO, null));

		} else if (Strings.isBlank(ano)) {
			camposNulos.put("ano", Arrays.asList(NULO_OU_VAZIO, null));
		}

		return camposNulos;

	}

}
