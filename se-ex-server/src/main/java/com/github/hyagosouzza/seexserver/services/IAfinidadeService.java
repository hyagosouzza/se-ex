package com.github.hyagosouzza.seexserver.services;

import com.github.hyagosouzza.seexserver.persistence.Afinidade;

public interface IAfinidadeService extends IAbstractService<Afinidade> {

	Afinidade findAfinidadeByRegiao(String regiao);

}
