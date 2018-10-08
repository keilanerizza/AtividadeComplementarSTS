package com.AtividadeComplementarSTS.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.AtividadeComplementarSTS.domains.Aluno;
import com.AtividadeComplementarSTS.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository repository;
	
	public List<Aluno> buscar(String nome) {
		return repository.findByNomeContaining(nome);
	}
	
	public Optional<Aluno> buscarRa(Long ra) {
		return repository.findById(ra);
	}
	
	public List<Aluno> buscarTodos() {
		return repository.findAll();
	}
}
