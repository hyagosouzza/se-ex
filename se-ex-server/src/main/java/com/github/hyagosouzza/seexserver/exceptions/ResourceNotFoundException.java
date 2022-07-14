package com.github.hyagosouzza.seexserver.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ResourceNotFoundException extends RuntimeException {

	@Getter
	private final String message;

}
