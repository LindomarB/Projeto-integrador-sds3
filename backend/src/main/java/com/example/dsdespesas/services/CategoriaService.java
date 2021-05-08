package com.example.dsdespesas.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dsdespesas.dto.CategoriaDTO;
import com.example.dsdespesas.entities.Categoria;
import com.example.dsdespesas.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoryRepository;

	public List<CategoriaDTO> findAll() {
		List<Categoria> resultado = categoryRepository.findAll();
		return resultado.stream().map(x -> new CategoriaDTO(x)).collect(Collectors.toList());
				
	}

}
