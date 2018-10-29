package com.AtividadeComplementarSTS;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.AtividadeComplementarSTS.domains.Aluno;
import com.AtividadeComplementarSTS.domains.Atividade;
import com.AtividadeComplementarSTS.domains.LancamentoAtividade;
import com.AtividadeComplementarSTS.repositories.AlunoRepository;
import com.AtividadeComplementarSTS.repositories.AtividadeRepository;
import com.AtividadeComplementarSTS.repositories.LancamentoAtividadeRepository;

@SpringBootApplication
public class AtividadeComplementarStsApplication implements CommandLineRunner {

	@Autowired
	AlunoRepository alunoRepository;
	
	@Autowired
	AtividadeRepository atividadeRepository;
	
	@Autowired
	LancamentoAtividadeRepository lancamentoRepository;

	public static void main(String[] args) {
		SpringApplication.run(AtividadeComplementarStsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Aluno al1 = new Aluno((long) 12345, "Fulano");
		Aluno al2 = new Aluno((long) 67890, "Ciclano");

		alunoRepository.saveAll(Arrays.asList(al1, al2));
		
		Atividade atv1 = new Atividade("palestra",(long) 1, 7, 50, 10);
		Atividade atv2 = new Atividade("workshop",(long) 2, 7, 50, 10);
		
		atividadeRepository.saveAll(Arrays.asList(atv1, atv2));
		
		LancamentoAtividade lanc1 = new LancamentoAtividade((long) 1, 5, new Date(), new Date(), al1, atv1);
		LancamentoAtividade lanc2 = new LancamentoAtividade((long) 1, 6, new Date(), new Date(), al2, atv2);
		
		lancamentoRepository.saveAll(Arrays.asList(lanc1, lanc2));

	}

}
