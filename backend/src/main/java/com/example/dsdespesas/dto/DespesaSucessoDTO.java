package com.example.dsdespesas.dto;

import java.io.Serializable;

import com.example.dsdespesas.entities.Categoria;

public class DespesaSucessoDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String categoriaNome;
	private Long ultima_fatura;
	private Long media_fatura;

	public DespesaSucessoDTO() {

	}

	public DespesaSucessoDTO(Categoria categoria, Long ultima_fatura, Long media_fatura) {
		categoriaNome = categoria.getNome();
		this.ultima_fatura = ultima_fatura;
		this.media_fatura = media_fatura;
	}

	public String getCategoriaNome() {
		return categoriaNome;
	}

	public void setCategoriaNome(String categoriaNome) {
		this.categoriaNome = categoriaNome;
	}

	public Long getUltima_fatura() {
		return ultima_fatura;
	}

	public void setUltima_fatura(Long ultima_fatura) {
		this.ultima_fatura = ultima_fatura;
	}

	public Long getMedia_fatura() {
		return media_fatura;
	}

	public void setMedia_fatura(Long media_fatura) {
		this.media_fatura = media_fatura;
	}

}
