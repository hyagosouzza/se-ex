package com.github.hyagosouzza.seexserver.dtos;

import com.github.hyagosouzza.seexserver.persistence.Estado;
import com.github.hyagosouzza.seexserver.validations.score.ValidScore;

public class PessoaCommand {

	private String nome;
	private String telefone;
	private String cidade;
	private Estado estado;
	private String regiao;
	private Integer idade;

	@ValidScore
	private Integer score;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}
}
