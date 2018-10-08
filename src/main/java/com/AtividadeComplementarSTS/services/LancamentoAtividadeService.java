package com.AtividadeComplementarSTS.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AtividadeComplementarSTS.domains.LancamentoAtividade;
import com.AtividadeComplementarSTS.repositories.LancamentoAtividadeRepository;

@Service
public class LancamentoAtividadeService {

	@Autowired
	private LancamentoAtividadeRepository repository;
	
	public Optional<LancamentoAtividade> buscarCodigo(Long codigo) {
		return repository.findById(codigo);
	}
	
	public List<LancamentoAtividade> buscarTodos() {
		return repository.findAll();
	}
}
