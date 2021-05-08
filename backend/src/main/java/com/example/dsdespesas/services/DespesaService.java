package com.example.dsdespesas.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dsdespesas.dto.DespesaDTO;
import com.example.dsdespesas.entities.Despesa;
import com.example.dsdespesas.repositories.CategoriaRepository;
import com.example.dsdespesas.repositories.DespesaRepository;
@Service
public class DespesaService {

	@Autowired
	private DespesaRepository despesaRepository;
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Transactional(readOnly = true)
	public Page<DespesaDTO> findAll(Pageable pageable) {
		categoriaRepository.findAll();
		Page<Despesa> resultado = despesaRepository.findAll(pageable);
		return resultado.map(x -> new DespesaDTO(x));		
	}
}
