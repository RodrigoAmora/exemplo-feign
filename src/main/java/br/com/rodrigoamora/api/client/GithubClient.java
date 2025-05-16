package br.com.rodrigoamora.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.rodrigoamora.dto.GithubUserDTO;

@FeignClient(url = "https://api.github.com/", name = "github")
public interface GithubClient {

	@GetMapping("users/{userName}")
	GithubUserDTO findGithubUserByLogin(@PathVariable("userName") String userName);
	
	
}
