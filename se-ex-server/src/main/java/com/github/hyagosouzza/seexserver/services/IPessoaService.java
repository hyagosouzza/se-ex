package com.github.hyagosouzza.seexserver.services;

import com.github.hyagosouzza.seexserver.dtos.PessoaCommand;
import com.github.hyagosouzza.seexserver.dtos.PessoaInListDto;
import com.github.hyagosouzza.seexserver.dtos.SingularPessoaDto;
import com.github.hyagosouzza.seexserver.exceptions.ResourceNotFoundException;
import com.github.hyagosouzza.seexserver.mappers.PessoaMapper;
import com.github.hyagosouzza.seexserver.persistence.Pessoa;
import com.github.hyagosouzza.seexserver.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IPessoaService {

	Pessoa save(PessoaCommand command);

	List<PessoaInListDto> listAll();

	SingularPessoaDto findById(final Long id);

}
