package com.AtividadeComplementarSTS.domains;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class LancamentoAtividade {

	@Id
	private Long codigo;
	private Integer quantidadeHoras;
	private Date dataInicio;
	private Date dataFim;
	
	@ManyToOne
	private Aluno aluno;
	
	@ManyToOne
	private Atividade atividade;
	
	public LancamentoAtividade() {
	}
	
	public LancamentoAtividade(Long codigo, Integer quantidadeHoras, Date dataInicio, Date dataFim, Aluno aluno, Atividade atividade) {
		super();
		this.codigo = codigo;
		this.quantidadeHoras = quantidadeHoras;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.aluno = aluno;
		this.atividade = atividade;
	}
	
//	O método irá retornar em qual semestre a atividade foi realizada, baseado na dataFim. Ex: a atividade terminou em Setembro de 2018: 2018-2.
	
	public String getSemestreAtividade() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataFim);
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH);
		
		if (mes > 5) {
			return ano + "-2";
		} else {
			return ano + "-1";
		}
	}
	
    /*public Integer getHorasAproveitadas() {
    }
*/
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidadeHoras() {
		return quantidadeHoras;
	}

	public void setQuantidadeHoras(Integer quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
}
