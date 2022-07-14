package com.github.hyagosouzza.seexserver.dtos;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@AllArgsConstructor
@NoArgsConstructor
public class ScoreCommand {

	private String scoreDescricao;

	@Min(value = 0, message = "Score deve ter o valor mínimo de 0")
	private Integer inicial;

	@Max(value = 1000, message = "Score deve ter o valor máximo de 1000")
	private Integer ffinal;

	public String getScoreDescricao() {
		return scoreDescricao;
	}

	public void setScoreDescricao(String scoreDescricao) {
		this.scoreDescricao = scoreDescricao;
	}

	public Integer getInicial() {
		return inicial;
	}

	public void setInicial(Integer inicial) {
		this.inicial = inicial;
	}

	public Integer getFfinal() {
		return ffinal;
	}

	public void setFfinal(Integer ffinal) {
		this.ffinal = ffinal;
	}
}
