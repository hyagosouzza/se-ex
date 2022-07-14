package com.github.hyagosouzza.seexserver.persistence;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@Entity
@Table(name = "afinidade")
public class Afinidade {

	@Id
	private String regiao;

	@Type(type = "com.vladmihalcea.hibernate.type.json.JsonType")
	private Estado[] estados;

}
