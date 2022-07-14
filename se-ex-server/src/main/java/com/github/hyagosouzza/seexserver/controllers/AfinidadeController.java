package com.github.hyagosouzza.seexserver.controllers;

import com.github.hyagosouzza.seexserver.openapi.ControllerTags;
import com.github.hyagosouzza.seexserver.openapi.DefaultResponses;
import com.github.hyagosouzza.seexserver.openapi.ServiceTags;
import com.github.hyagosouzza.seexserver.persistence.Afinidade;
import com.github.hyagosouzza.seexserver.services.IAfinidadeService;
import com.github.hyagosouzza.seexserver.services.impl.AfinidadeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(ControllerTags.AFINIDADE)
@Tag(name = ServiceTags.AFINIDADE)
public class AfinidadeController {

	@Autowired
	private IAfinidadeService service;

	@Operation(summary = "Lista afinidade", description = "Retorna uma lista de todas as afinidades cadastradas")
	@DefaultResponses
	@GetMapping
	public List<Afinidade> listAllAfinidades() {
		return service.listAll();
	}

	@Operation(summary = "Cria afinidade")
	@DefaultResponses
	@PostMapping
	public ResponseEntity<Afinidade> saveAfinidade(@RequestBody Afinidade afinidade) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(afinidade));
	}

}
