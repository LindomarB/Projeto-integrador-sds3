package com.example.dsdespesas.dto;

import java.time.LocalDate;

import com.example.dsdespesas.entities.Despesa;

public class DespesaDTO {
	private Long id;
	private Integer ultima_fatura;
	private Integer media_fatura;
	private Double total;
	private LocalDate date;
	private CategoriaDTO categoria;

	public DespesaDTO() {

	}

	public DespesaDTO(Long id, Integer ultima_fatura, Integer media_fatura, Double total, LocalDate date,
			CategoriaDTO categoria) {
		this.id = id;
		this.ultima_fatura = ultima_fatura;
		this.media_fatura = media_fatura;
		this.total = total;
		this.date = date;
		this.categoria = categoria;
	}

	public DespesaDTO(Despesa entity) {
		this.id = entity.getId();
		this.ultima_fatura = entity.getUltima_fatura();
		this.media_fatura = entity.getMedia_fatura();
		this.total = entity.getTotal();
		this.date = entity.getDate();
		this.categoria = new CategoriaDTO(entity.getCategoria());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getUltima_fatura() {
		return ultima_fatura;
	}

	public void setUltima_fatura(Integer ultima_fatura) {
		this.ultima_fatura = ultima_fatura;
	}

	public Integer getMedia_fatura() {
		return media_fatura;
	}

	public void setMedia_fatura(Integer media_fatura) {
		this.media_fatura = media_fatura;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public CategoriaDTO getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaDTO categoria) {
		this.categoria = categoria;
	}

}
