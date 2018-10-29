	package com.AtividadeComplementarSTS.domains;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Atividade implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;

	private String nome;
	private Integer maximoAtividadesSemestre;
	private Integer percentualCargaHoraria;
	private Integer percentualPorAtividade;

	public Atividade() {
	}

	public Atividade(String nome, Long codigo, Integer maximoAtividadesSemestre, Integer percentualCargaHoraria,
			Integer percentualPorAtividade) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
		this.percentualCargaHoraria = percentualCargaHoraria;
		this.percentualPorAtividade = percentualPorAtividade;
	}
	
	public Integer getValorLimiteHorasAtividade(Integer totalHorasComplementares) {
		return totalHorasComplementares * percentualPorAtividade / 100;
	}
	
	public Integer getHorasAproveitadasPorAtividade(Integer totalhorasComplementares) {
		return getValorLimiteHorasAtividade(totalhorasComplementares) * percentualCargaHoraria / 100; 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Integer getMaximoAtividadesSemestre() {
		return maximoAtividadesSemestre;
	}

	public void setMaximoAtividadesSemestre(Integer maximoAtividadesSemestre) {
		this.maximoAtividadesSemestre = maximoAtividadesSemestre;
	}

	public Integer getPercentualCargaHoraria() {
		return percentualCargaHoraria;
	}

	public void setPercentualCargaHoraria(Integer percentualCargaHoraria) {
		this.percentualCargaHoraria = percentualCargaHoraria;
	}

	public Integer getPercentualPorAtividade() {
		return percentualPorAtividade;
	}

	public void setPercentualPorAtividade(Integer percentualPorAtividade) {
		this.percentualPorAtividade = percentualPorAtividade;
	}
	
}
