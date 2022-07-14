package com.github.hyagosouzza.seexserver.exceptions.handlers;

import com.github.hyagosouzza.seexserver.exceptions.ResourceNotFoundException;
import com.github.hyagosouzza.seexserver.exceptions.response.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ResourceNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = {ResourceNotFoundException.class})
	protected ResponseEntity<ApiErrorResponse> handle(Exception ex, WebRequest request) {
		if (ex instanceof ResourceNotFoundException) {
			ApiErrorResponse response = ApiErrorResponse.builder().message(ex.getMessage()).build();
			return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
		}

		ApiErrorResponse response = ApiErrorResponse.builder().message(ex.getMessage()).build();
		return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
