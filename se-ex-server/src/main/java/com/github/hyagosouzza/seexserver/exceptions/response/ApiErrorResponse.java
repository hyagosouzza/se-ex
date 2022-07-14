package com.github.hyagosouzza.seexserver.exceptions.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Builder
public class ApiErrorResponse {

	@Getter
	private final String message;

}
