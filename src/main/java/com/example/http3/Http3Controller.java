package com.example.http3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
class Http3Controller {

	private final RestClient restClient;

	Http3Controller(RestClient restClient) {
		this.restClient = restClient;
	}

	@GetMapping("/remote")
	String remote() {
		return restClient.get()
				.uri("https://projectreactor.io/")
				.retrieve()
				.body(String.class);
	}
}
