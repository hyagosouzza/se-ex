package com.github.hyagosouzza.seexserver.services.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.github.hyagosouzza.seexserver.dtos.PessoaInListDto;
import com.github.hyagosouzza.seexserver.dtos.SingularPessoaDto;
import com.github.hyagosouzza.seexserver.mappers.PessoaMapper;
import com.github.hyagosouzza.seexserver.mappers.PessoaMapperImpl;
import com.github.hyagosouzza.seexserver.persistence.Pessoa;
import com.github.hyagosouzza.seexserver.services.IPessoaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

@SpringBootTest
class PessoaServiceTest {

	@Autowired
	private IPessoaService service;

	@MockBean
	private PessoaMapperImpl mapper;

	private Pessoa pessoa;

	@BeforeEach
	public void setup() {
		/* given */
		when(mapper.fromCommand(null)).thenReturn(new Pessoa());
		when(mapper.toSingular(any())).thenCallRealMethod();
		when(mapper.toPessoaInList(anyList())).thenCallRealMethod();

		pessoa = service.save(null);
	}

	@Test
	void save() {
		/* when */
		final Pessoa pessoa = service.save(null);

		/* then */
		assertNotNull(pessoa);
		assertNotNull(pessoa.getId());
		assertNotNull(pessoa.getDataInclusao());
	}

	@Test
	void listAll() {
		final List<PessoaInListDto> list = service.listAll();

		assertNotNull(list);
		assertTrue(list.size() > 0);
	}

	@Test
	void findById() {
		final Long id = pessoa.getId();
		final SingularPessoaDto singularPessoaDto = service.findById(id);

		assertNotNull(singularPessoaDto);
		assertEquals(singularPessoaDto.getId(), id);
	}
}
