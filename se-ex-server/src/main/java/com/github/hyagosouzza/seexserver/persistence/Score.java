package com.github.hyagosouzza.seexserver.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Entity
@Table(name = "score")
public class Score {

	@Id
	private String descricao;

	@Min(value = 0, message = "Score deve ter o valor mínimo de 0")
	private Integer inicial;

	@Max(value = 1000, message = "Score deve ter o valor máximo de 1000")
	@Column(name = "final")
	private Integer ffinal;

}
