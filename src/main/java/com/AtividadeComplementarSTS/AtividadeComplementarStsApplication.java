package com.AtividadeComplementarSTS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.AtividadeComplementarSTS.domains.Aluno;
import com.AtividadeComplementarSTS.domains.Atividade;
import com.AtividadeComplementarSTS.repositories.AlunoRepository;
import com.AtividadeComplementarSTS.repositories.AtividadeRepository;

@SpringBootApplication
public class AtividadeComplementarStsApplication implements CommandLineRunner {

	@Autowired
	AlunoRepository alunoRepository;
	
	AtividadeRepository atividadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(AtividadeComplementarStsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Aluno al1 = new Aluno((long) 12345, "Fulano");
		Aluno al2 = new Aluno((long) 67890, "Ciclano");

		List<Aluno> alunos = new ArrayList<>();
		alunos.add(al1);
		alunos.add(al2);

		alunoRepository.saveAll(Arrays.asList(al1, al2));
		
		Atividade atv1 = new Atividade("palestra", 1, 7, 50, 10);
		Atividade atv2 = new Atividade("workshop", 2, 7, 50, 10);
		
		List<Atividade> atividades = new ArrayList<>();
		atividades.add(atv1);
		atividades.add(atv2);
		
		atividadeRepository.saveAll(Arrays.asList(atv1, atv2));

	}

}
