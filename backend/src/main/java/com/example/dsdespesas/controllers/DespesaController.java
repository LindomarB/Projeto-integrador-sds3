package com.example.dsdespesas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsdespesas.dto.DespesaDTO;
import com.example.dsdespesas.dto.DespesaSucessoDTO;
import com.example.dsdespesas.dto.DespesaSumDTO;
import com.example.dsdespesas.services.DespesaService;

@RestController
@RequestMapping(value ="/despesas")
public class DespesaController {
	@Autowired
	private DespesaService service;
	@GetMapping
	public ResponseEntity<Page<DespesaDTO>> findAll(Pageable pageable){
		Page<DespesaDTO> lista = service.findAll(pageable);
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value="/total-por-categoria")
	public ResponseEntity<List<DespesaSumDTO>> totalPorCategoria(){
		List<DespesaSumDTO> lista = service.totalPorCategoria();
		return ResponseEntity.ok(lista);
	}
	
	@GetMapping(value="/sucesso-por-categoria")
	public ResponseEntity<List<DespesaSucessoDTO>> sucessoPorCategoria(){
		List<DespesaSucessoDTO> lista = service.sucessoPorCategoria();
		return ResponseEntity.ok(lista);
	}
	
	
}
