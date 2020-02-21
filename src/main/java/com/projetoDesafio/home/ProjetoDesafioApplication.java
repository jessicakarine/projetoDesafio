package com.projetoDesafio.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import com.projetoDesafio.home.model.Apartamento;
import com.projetoDesafio.home.model.Despesa;
import com.projetoDesafio.home.model.Proprietario;
import com.projetoDesafio.home.repositorio.ApartamentoRepository;
import com.projetoDesafio.home.repositorio.DespesaRepository;
import com.projetoDesafio.home.repositorio.ProprietarioRepository;

@SpringBootApplication
@Component
public class ProjetoDesafioApplication implements CommandLineRunner {

	@Autowired
	private ApartamentoRepository apartamentoRepository;
	
	@Autowired
	private DespesaRepository despesaRepository;
	
	@Autowired
	private ProprietarioRepository proprietarioRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(ProjetoDesafioApplication.class, args);
    }

	@Override
	public void run(String... args) throws Exception {
		
		Apartamento apartamento = new Apartamento();
		
		Despesa despesa = new Despesa();
		despesa.setCustosExtras(22.1);
		despesa.setCustosOperacionais(200.1);
		despesa.setData("22/03/2020");
		despesa.setGas(45.5);
		despesaRepository.save(despesa);
		
		Proprietario proprietario = new Proprietario();
		proprietario.setEmail("jessica@gmail.com");
		proprietario.setNome("Jessica K");
		proprietario.setTelefone("8198989898");
		proprietarioRepository.save(proprietario);
		
		apartamento.setDespesa(despesa);
		apartamento.setProprietario(proprietario);
		apartamento.setAndar(1);
		apartamento.setNumeroApt(102);
		apartamentoRepository.save(apartamento); 
		
	}
}
