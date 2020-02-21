package com.projetoDesafio.home.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoDesafio.home.model.Despesa;

	public interface DespesaRepository extends JpaRepository<Despesa, Integer> {

	}

