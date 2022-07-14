package com.github.hyagosouzza.seexserver.mappers;

import com.github.hyagosouzza.seexserver.dtos.PessoaCommand;
import com.github.hyagosouzza.seexserver.dtos.PessoaInListDto;
import com.github.hyagosouzza.seexserver.dtos.SingularPessoaDto;
import com.github.hyagosouzza.seexserver.persistence.Afinidade;
import com.github.hyagosouzza.seexserver.persistence.Pessoa;
import com.github.hyagosouzza.seexserver.persistence.Score;
import com.github.hyagosouzza.seexserver.services.impl.AfinidadeService;
import com.github.hyagosouzza.seexserver.services.impl.ScoreService;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper(componentModel = "spring",
		uses = {ScoreService.class, AfinidadeService.class},
		injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class PessoaMapper {

	private ScoreService scoreService;
	private AfinidadeService afinidadeService;

	@Mappings({
			@Mapping(target = "regiao", source = "regiao", qualifiedByName = "findAfinidadeByRegiao"),
			@Mapping(target = "score", source = "score", qualifiedByName = "findByScoreValue"),
	})
	public abstract Pessoa fromCommand(PessoaCommand command);

	@Mappings({
			@Mapping(target = "estados", source = "regiao.estados"),
			@Mapping(target = "scoreDescricao", source = "score.descricao"),
	})
	public abstract SingularPessoaDto toSingular(Pessoa pessoa);

	@Mappings({
			@Mapping(target = "estados", source = "regiao.estados"),
			@Mapping(target = "scoreDescricao", source = "score.descricao"),
	})
	public abstract PessoaInListDto toPessoaInList(Pessoa pessoa);

	public abstract List<PessoaInListDto> toPessoaInList(List<Pessoa> pessoas);

	@Named("findByScoreValue")
	public Score findByScoreValue(final Integer value) {
		return scoreService.findByScoreValue(value);
	}

	@Named("findAfinidadeByRegiao")
	public Afinidade findAfinidadeByRegiao(final String regiao) {
		return afinidadeService.findAfinidadeByRegiao(regiao);
	}

	@Autowired
	public void setScoreService(final ScoreService scoreService) {
		this.scoreService = scoreService;
	}

	@Autowired
	public void setAfinidadeService(final AfinidadeService afinidadeService) {
		this.afinidadeService = afinidadeService;
	}

}
