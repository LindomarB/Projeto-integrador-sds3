package com.example.dsdespesas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_despesas")
public class Despesa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer ultima_fatura;
	private Integer media_fatura;
	private Double total;
	private LocalDate date;
	@ManyToOne
	@JoinColumn(name = "categoria_id")
	private Categoria categoria;

	public Despesa(Long id, Integer ultima_fatura, Integer media_fatura, Double total, LocalDate date,
			Categoria categoria) {

		this.id = id;
		this.ultima_fatura = ultima_fatura;
		this.media_fatura = media_fatura;
		this.total = total;
		this.date = date;
		this.categoria = categoria;
	}

	public Despesa() {

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

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}