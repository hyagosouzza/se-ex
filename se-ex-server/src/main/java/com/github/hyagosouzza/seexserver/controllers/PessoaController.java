package com.github.hyagosouzza.seexserver.controllers;

import com.github.hyagosouzza.seexserver.dtos.PessoaCommand;
import com.github.hyagosouzza.seexserver.dtos.PessoaInListDto;
import com.github.hyagosouzza.seexserver.dtos.SingularPessoaDto;
import com.github.hyagosouzza.seexserver.openapi.ControllerTags;
import com.github.hyagosouzza.seexserver.openapi.DefaultResponses;
import com.github.hyagosouzza.seexserver.openapi.ServiceTags;
import com.github.hyagosouzza.seexserver.persistence.Pessoa;
import com.github.hyagosouzza.seexserver.services.IPessoaService;
import com.github.hyagosouzza.seexserver.services.impl.PessoaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(ControllerTags.PESSOA)
@Tag(name = ServiceTags.PESSOA)
public class PessoaController {

	@Autowired
	private IPessoaService service;

	@Operation(summary = "Lista pessoas", description = "Retorna uma lista de todas as pessoas cadastradas")
	@DefaultResponses
	@GetMapping
	public ResponseEntity<List<PessoaInListDto>> listAllPessoas() {
		final List<PessoaInListDto> pessoas = service.listAll();
		return ResponseEntity.status(pessoas.isEmpty() ? HttpStatus.NO_CONTENT : HttpStatus.OK).body(pessoas);
	}

	@Operation(summary = "Lista pessoas", description = "Retorna uma lista de todas as pessoas cadastradas")
	@DefaultResponses
	@GetMapping("/{id}")
	public SingularPessoaDto findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@Operation(summary = "Cria pessoa")
	@DefaultResponses
	@PostMapping
	public ResponseEntity<Pessoa> savePessoa(@Valid @RequestBody PessoaCommand command) {
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(command));
	}

}
