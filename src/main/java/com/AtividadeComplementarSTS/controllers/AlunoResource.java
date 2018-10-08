package com.AtividadeComplementarSTS.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.AtividadeComplementarSTS.domains.Aluno;
import com.AtividadeComplementarSTS.services.AlunoService;

@RestController
@RequestMapping(value = "/alunos")
public class AlunoResource {

	@Autowired
	private AlunoService service;

	@RequestMapping(value = "like/{nome}", method = RequestMethod.GET)
	public ResponseEntity<?> findByNome(@PathVariable String nome) {
		List<Aluno> alunos = service.buscar(nome);
		return ResponseEntity.ok().body(alunos);
	}

	@RequestMapping(value = "{ra}", method = RequestMethod.GET)
	public ResponseEntity<?> findByRa(@PathVariable Long ra) {
		Optional<Aluno> aluno = service.buscarRa(ra);
		return ResponseEntity.ok().body(aluno);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> findAll() {
		List<Aluno> aluno = service.buscarTodos();
		return ResponseEntity.ok().body(aluno);
	}

}
