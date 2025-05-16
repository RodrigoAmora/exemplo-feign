package br.com.rodrigoamora.api.doc;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.rodrigoamora.dto.ErroMessageDTO;
import br.com.rodrigoamora.dto.GithubUserDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

public interface IGithubClientDoc {

	@Operation(summary = "Search of user in Github")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Search Github user", content = @Content(schema = @Schema(implementation = GithubUserDTO.class))),
			@ApiResponse(responseCode = "400", description = "Search Github user", content = @Content(schema = @Schema(implementation = ErroMessageDTO.class))),
			@ApiResponse(responseCode = "404", description = "Search Github user", content = @Content(schema = @Schema(implementation = ErroMessageDTO.class))),
			@ApiResponse(responseCode = "500", description = "Search Github user", content = @Content(schema = @Schema(implementation = ErroMessageDTO.class))),
	})
	ResponseEntity<GithubUserDTO> findGithubUserByLogin(@PathVariable("userName") String userName);
	
}
