package com.github.hyagosouzza.seexserver.mappers;

import com.github.hyagosouzza.seexserver.dtos.ScoreCommand;
import com.github.hyagosouzza.seexserver.persistence.Score;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public abstract class ScoreMapper {

	@Mappings({
			@Mapping(target = "descricao", source = "scoreDescricao"),
	})
	public abstract Score fromCommand(ScoreCommand command);

}
