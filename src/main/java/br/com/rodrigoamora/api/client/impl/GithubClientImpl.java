package br.com.rodrigoamora.api.client.impl;

import org.springframework.stereotype.Component;

import br.com.rodrigoamora.api.client.GithubClient;
import br.com.rodrigoamora.api.dto.GithubUserDTO;

@Component
public class GithubClientImpl {

	private final GithubClient githubClient;
	// https://felixgilioli.medium.com/feign-uma-maneira-elegante-de-criar-clientes-http-em-java-c7c13c318cbe
	public GithubClientImpl(GithubClient githubClient) {
		this.githubClient = githubClient;
	}
	
	public GithubUserDTO findGithubUserByLogin(String userName) {
		return this.githubClient.findGithubUserByLogin(userName);
	}

}
