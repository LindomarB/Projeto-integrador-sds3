package com.example.dsdespesas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dsdespesas.dto.CategoriaDTO;
import com.example.dsdespesas.services.CategoriaService;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaController {
	@Autowired
	private CategoriaService service;
	@GetMapping
	public ResponseEntity<List<CategoriaDTO>> findAll(){
		List<CategoriaDTO> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
}
