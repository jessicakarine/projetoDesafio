package com.projetoDesafio.home.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoDesafio.home.model.Apartamento;

	public interface ApartamentoRepository extends JpaRepository<Apartamento, Integer> {

	}

