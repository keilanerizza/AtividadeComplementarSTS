package com.AtividadeComplementarSTS.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AtividadeComplementarSTS.domains.Atividade;
import com.AtividadeComplementarSTS.repositories.AtividadeRepository;

@Service
public class AtividadeService {

	@Autowired
	private AtividadeRepository repository;
	
	public List<Atividade> buscar(String nome) {
		return repository.findByNomeContaining(nome);
	}
	
	public Optional<Atividade> buscarCodigo(Long codigo) {
		return repository.findById(codigo);
	}
	
	public List<Atividade> buscarTodos() {
		return repository.findAll();
	}
}
