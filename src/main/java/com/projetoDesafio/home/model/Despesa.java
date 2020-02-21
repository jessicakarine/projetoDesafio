package com.projetoDesafio.home.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Despesa implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private double gas;
	private double custosOperacionais;
	private double custosExtras;
	private String data;
	
	public Despesa() {
		// TODO Auto-generated constructor stub
	}
	
	public Despesa(Integer id, double gas, double custosOperacionais, double custosExtras, String data) {
		super();
		this.id = id;
		this.gas = gas;
		this.custosOperacionais = custosOperacionais;
		this.custosExtras = custosExtras;
		this.data = data;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getGas() {
		return gas;
	}
	public void setGas(double gas) {
		this.gas = gas;
	}
	public double getCustosOperacionais() {
		return custosOperacionais;
	}
	public void setCustosOperacionais(double custosOperacionais) {
		this.custosOperacionais = custosOperacionais;
	}
	public double getCustosExtras() {
		return custosExtras;
	}
	public void setCustosExtras(double custosExtras) {
		this.custosExtras = custosExtras;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
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
		Despesa other = (Despesa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}