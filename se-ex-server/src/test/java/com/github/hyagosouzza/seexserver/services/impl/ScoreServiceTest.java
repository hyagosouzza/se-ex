package com.github.hyagosouzza.seexserver.services.impl;

import com.github.hyagosouzza.seexserver.dtos.ScoreCommand;
import com.github.hyagosouzza.seexserver.persistence.Afinidade;
import com.github.hyagosouzza.seexserver.persistence.Estado;
import com.github.hyagosouzza.seexserver.persistence.Score;
import com.github.hyagosouzza.seexserver.services.IScoreService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ScoreServiceTest {

	@Autowired
	private IScoreService scoreService;

	private Score score;

	@BeforeEach
	public void setup() {
		score = new Score("Top", 900, 1000);
		score = scoreService.save(new ScoreCommand("Top", 900, 1000));
	}

	@Test
	public void save() {
		final Score saved = scoreService.save(new ScoreCommand("Ruim", 300, 400));

		assertNotNull(saved);
	}

	@Test
	public void findByScoreValue() {
		final Score founded = scoreService.findByScoreValue(950);

		assertNotNull(founded);
		assertEquals(founded, score);
	}

	@Test
	public void listAll() {
		final List<Score> list = scoreService.listAll();

		assertNotNull(list);
		assertTrue(list.size() > 0);
	}
}
