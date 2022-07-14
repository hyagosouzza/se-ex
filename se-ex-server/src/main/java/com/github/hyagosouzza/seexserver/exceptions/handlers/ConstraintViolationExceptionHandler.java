package com.github.hyagosouzza.seexserver.exceptions.handlers;

import com.github.hyagosouzza.seexserver.exceptions.response.ApiErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@ControllerAdvice(annotations = {RestController.class})
public class ConstraintViolationExceptionHandler {

	@ExceptionHandler({MethodArgumentNotValidException.class, HttpMessageNotReadableException.class})
	public ResponseEntity<ApiErrorResponse> handleBindingErrors(Exception ex) {
		if (ex instanceof MethodArgumentNotValidException) {
			return new ResponseEntity<>(
					ApiErrorResponse.builder().message(
							((MethodArgumentNotValidException) ex).getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.joining(","))
					).build(), HttpStatus.BAD_REQUEST);
		} else {
			return new ResponseEntity<>(ApiErrorResponse.builder().message(ex.getMessage()).build(), HttpStatus.BAD_REQUEST);
		}
	}

}
