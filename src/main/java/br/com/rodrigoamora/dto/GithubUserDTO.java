package br.com.rodrigoamora.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public record GithubUserDTO(
		
		String login,
		
		String name,
		
		@JsonProperty("avatar_url")
		String avatarURL,
		
		@JsonProperty("html_url")
		String profileURL,
		
		@JsonProperty("public_repos")
		String publicRepos,
		
		@JsonProperty("public_gists")
		String publicGists,
		
		@JsonProperty("repos_url")
		String reposURL
		
) {}
