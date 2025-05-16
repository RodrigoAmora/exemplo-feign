package br.com.rodrigoamora.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rodrigoamora.api.doc.IGithubClientDoc;
import br.com.rodrigoamora.dto.GithubUserDTO;
import br.com.rodrigoamora.exception.MyCustomException;
import br.com.rodrigoamora.service.GithubService;

@RestController
@RequestMapping("/github")
public class GithubController implements IGithubClientDoc {

	private final GithubService githubService;

	public GithubController(GithubService githubService) {
		this.githubService = githubService;
	}
	
	@Override
	@GetMapping("/user/{userName}")
	public ResponseEntity<GithubUserDTO> findGithubUserByLogin(@PathVariable(name = "userName") String userName) {
		GithubUserDTO user = this.githubService.findGithubUserByLogin(userName);
		
		String name = user.name();
		if (name == null || name.isEmpty()) {
			throw new MyCustomException("Github user not found!");
		}
		
		return ResponseEntity.ok(user);
	}
	
}
