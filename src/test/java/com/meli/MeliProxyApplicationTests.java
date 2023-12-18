package com.meli;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class MeliProxyApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void testCategoryRoute() {
		ResponseEntity<String> response = restTemplate.getForEntity("/categories/MLA1055", String.class);
		Assertions.assertNotEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
	}

	@Test
	void contextLoads() {
	}
	
	@Test
	void testProxyContext() {
	}

}
