package com.AtividadeComplementarSTS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AtividadeComplementarSTS.domains.LancamentoAtividade;

@Repository
public interface LancamentoAtividadeRepository extends JpaRepository<LancamentoAtividade,Long>{
	
	

}
	