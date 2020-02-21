package com.projetoDesafio.home.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Apartamento implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer andar;
	
	private Integer numeroApt;
	
	@OneToOne
	private Proprietario proprietario;
	
	@OneToOne
	private Despesa despesa;

	public Apartamento() {
		// TODO Auto-generated constructor stub
	}

	public Apartamento(Integer id, Integer andar, Integer numeroApt, Proprietario proprietario, Despesa despesa) {
		super();
		this.id = id;
		this.andar = andar;
		this.numeroApt = numeroApt;
		this.proprietario = proprietario;
		this.despesa = despesa;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public Integer getNumeroApt() {
		return numeroApt;
	}

	public void setNumeroApt(Integer numeroApt) {
		this.numeroApt = numeroApt;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public Despesa getDespesa() {
		return despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apartamento other = (Apartamento) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
