package com.AtividadeComplementarSTS.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.AtividadeComplementarSTS.domains.Atividade;

@Repository
public interface AtividadeRepository extends JpaRepository<Atividade,Long>{
	
	public List<Atividade> findByNomeContaining(@Param("nome") String nome);

}
	