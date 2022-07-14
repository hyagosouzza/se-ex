package com.github.hyagosouzza.seexserver.services.impl;

import com.github.hyagosouzza.seexserver.dtos.ScoreCommand;
import com.github.hyagosouzza.seexserver.persistence.Afinidade;
import com.github.hyagosouzza.seexserver.persistence.Estado;
import com.github.hyagosouzza.seexserver.persistence.Score;
import com.github.hyagosouzza.seexserver.services.IAfinidadeService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AfinidadeServiceTest {

	@Autowired
	private IAfinidadeService afinidadeService;

	private Afinidade afinidade;

	@BeforeEach
	public void setup() {
		afinidade = afinidadeService.save(new Afinidade("sudeste", new Estado[]{Estado.SP}));
	}

	@Test
	public void save() {
		final Afinidade saved = afinidadeService.save(new Afinidade("centro-oeste", new Estado[]{Estado.GO}));

		assertNotNull(saved);
	}

	@Test
	public void findAfinidadeByRegiao() {
		final Afinidade founded = afinidadeService.findAfinidadeByRegiao(afinidade.getRegiao());

		assertNotNull(founded);
		assertEquals(founded, afinidade);
	}

	@Test
	public void listAll() {
		final List<Afinidade> list = afinidadeService.listAll();

		assertNotNull(list);
		assertTrue(list.size() > 0);
	}
}
