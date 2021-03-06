package com.example.dsdespesas.dto;

import java.io.Serializable;

import com.example.dsdespesas.entities.Categoria;


public class DespesaSumDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	private String categoriaNome;
	private Double soma;
	
	public DespesaSumDTO() {
		
	}


	public DespesaSumDTO(Categoria categoria, Double soma) {
		categoriaNome = categoria.getNome();
		this.soma = soma;
	}


	public String getCategoriaNome() {
		return categoriaNome;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	}

	public Double getSoma() {
		return soma;
	}

	public void setSoma(Double soma) {
		this.soma = soma;
	}
	

}
