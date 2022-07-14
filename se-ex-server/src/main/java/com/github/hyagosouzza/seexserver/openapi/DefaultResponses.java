package com.github.hyagosouzza.seexserver.openapi;

import com.github.hyagosouzza.seexserver.exceptions.response.ApiErrorResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ApiResponses({
		@ApiResponse(responseCode = "200", description = "Ok"),
		@ApiResponse(responseCode = "204", description = "No Content"),
		@ApiResponse(responseCode = "201", description = "Created", content = {
				@Content(mediaType = "application/json")
		}),
		@ApiResponse(responseCode = "400", description = "Bad request", content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
		}),
		@ApiResponse(responseCode = "404", description = "Not found", content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
		}),
		@ApiResponse(responseCode = "409", description = "Validation Error", content = {
				@Content(mediaType = "application/json", schema = @Schema(implementation = ApiErrorResponse.class))
		})
})
public @interface DefaultResponses {
}
