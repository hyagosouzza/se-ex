package com.github.hyagosouzza.seexserver.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "pessoa")
public class Pessoa extends AuditableEntity {

	private String nome;
	private String telefone;
	private String cidade;

	@Enumerated(EnumType.STRING)
	private Estado estado;

	@ManyToOne
	@JoinColumn(name = "regiao")
	private Afinidade regiao;

	private Integer idade;

	@ManyToOne
	@JoinColumn(name = "score")
	private Score score;

}
