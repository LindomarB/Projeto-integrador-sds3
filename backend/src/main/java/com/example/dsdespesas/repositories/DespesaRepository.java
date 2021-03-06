package com.example.dsdespesas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dsdespesas.dto.DespesaSucessoDTO;
import com.example.dsdespesas.dto.DespesaSumDTO;
import com.example.dsdespesas.entities.Despesa;
@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {
	@Query("SELECT new com.example.dsdespesas.dto.DespesaSumDTO(obj.categoria, SUM(obj.total)) "
			+ "FROM Despesa AS obj GROUP BY obj.categoria")
	List<DespesaSumDTO> totalPorCategoria();
	
	@Query("SELECT new com.example.dsdespesas.dto.DespesaSucessoDTO(obj.categoria, SUM(obj.ultima_fatura), SUM(obj.media_fatura)) "
			+ "FROM Despesa AS obj GROUP BY obj.categoria")
	List<DespesaSucessoDTO> sucessoPorCategoria();

}
