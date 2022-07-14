package com.github.hyagosouzza.seexserver.controllers;

import com.github.hyagosouzza.seexserver.dtos.ScoreCommand;
import com.github.hyagosouzza.seexserver.openapi.ControllerTags;
import com.github.hyagosouzza.seexserver.openapi.DefaultResponses;
import com.github.hyagosouzza.seexserver.openapi.ServiceTags;
import com.github.hyagosouzza.seexserver.persistence.Score;
import com.github.hyagosouzza.seexserver.services.IScoreService;
import com.github.hyagosouzza.seexserver.services.impl.ScoreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(ControllerTags.SCORE)
@Tag(name = ServiceTags.SCORE)
public class ScoreController {

	@Autowired
	private IScoreService service;

	@Operation(summary = "Lista scores", description = "Retorna uma lista de todas os scores cadastrados")
	@DefaultResponses
	@GetMapping
	public List<Score> listAllScores() {
		return service.listAll();
	}

	@Operation(summary = "Cria score")
	@DefaultResponses
	@PostMapping
	public ResponseEntity<Score> saveController(@Valid @RequestBody ScoreCommand command) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(command));
	}

}
