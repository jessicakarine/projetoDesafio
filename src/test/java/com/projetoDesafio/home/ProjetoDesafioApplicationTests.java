package com.projetoDesafio.home;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.projetoDesafio.home.model.Proprietario;
import com.projetoDesafio.home.repositorio.ProprietarioRepository;

@SpringBootTest
public class ProjetoDesafioApplicationTests {

	GestaoProprietarioController cpc;

	@Mock
	private ProprietarioRepository proprietarios;

	@Before
	public void Init() {
		MockitoAnnotations.initMocks(this);
		this.cpc = new GestaoProprietarioController(proprietarios);
	}

	@Test
	public void testGestaoProprietarioController() {

		Proprietario pro = getGerarProprietario();
		pro.setId(2);

		when(proprietarios.save(Mockito.any(Proprietario.class))).thenReturn(pro);
		Proprietario retorno = cpc.adicionar(getGerarProprietario());

		assertThat(retorno, is(notNullValue()));
		assertThat(retorno.getId(), is(equalTo(2)));
		assertThat(retorno.getNome(), is(equalTo("Jessica K")));
		assertThat(retorno.getTelefone(), is(equalTo("8198989898")));
		assertThat(retorno.getEmail(), is(equalTo("jessica@gmail.com")));
	}

	private Proprietario getGerarProprietario() {

		Proprietario proprietario = new Proprietario();
		proprietario.setEmail("jessica@gmail.com");
		proprietario.setNome("Jessica K");
		proprietario.setTelefone("8198989898");
		return proprietario;
	}
}
