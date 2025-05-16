package br.com.rodrigoamora.service;

import org.springframework.stereotype.Service;

import br.com.rodrigoamora.api.client.impl.GithubClientImpl;
import br.com.rodrigoamora.dto.GithubUserDTO;

@Service
public class GithubService {

	private final GithubClientImpl githubClientImpl;
	
	public GithubService(GithubClientImpl githubClientImpl) {
		this.githubClientImpl = githubClientImpl;
	}

	public GithubUserDTO findGithubUserByLogin(String userName) {
		return githubClientImpl.findGithubUserByLogin(userName);
	}
	
}
