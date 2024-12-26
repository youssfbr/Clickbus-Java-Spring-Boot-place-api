package com.github.youssfbr.place;

import com.github.youssfbr.place.api.CreatePlaceDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PlaceApplicationTests {

	@Autowired
	WebTestClient webTestClient;

	@Test
	void testCreatePlaceSuccess() {
		var name = "Valid Name";
		var state = "Valid State";
		var slug = "valid-name";

		webTestClient
				.post()
				.uri("/places")
				.bodyValue(new CreatePlaceDTO(name , state)
				)
				.exchange()
				.expectBody()
				.jsonPath("name").isEqualTo(name)
				.jsonPath("state").isEqualTo(state)
				.jsonPath("slug").isEqualTo(slug)
				.jsonPath("createdAt").isNotEmpty()
				.jsonPath("updatedAt").isNotEmpty();
	}

	@Test
	void testCreatePlaceFailure() {
		var name = "";
		var state = "";

		webTestClient
				.post()
				.uri("/places")
				.bodyValue(new CreatePlaceDTO(name , state)
				)
				.exchange()
				.expectStatus().isBadRequest();
	}

}
