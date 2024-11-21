package com.example.http3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
class Http3Controller {

	private final RestClient http3RestClient;

	Http3Controller(RestClient http3RestClient) {
		this.http3RestClient = http3RestClient;
	}

	@GetMapping("/remote")
	String remote() {
		return http3RestClient.get()
				.uri("https://projectreactor.io/")
				.retrieve()
				.body(String.class);
	}
}
