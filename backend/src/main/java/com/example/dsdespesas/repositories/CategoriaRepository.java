package com.example.dsdespesas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dsdespesas.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
