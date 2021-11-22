package com.example.mongospringapi;

import com.adelean.inject.resources.junit.jupiter.GivenTextResource;
import com.adelean.inject.resources.junit.jupiter.TestWithResources;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestWithResources
class MongoSpringApiApplicationTests {

/*	@Test
	void contextLoads() {
	}
*/
	@Autowired
	private PolicyController controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@GivenTextResource("/com.example.mongospringapi/allpolicyresponse.json")
	String resourceContent;

	@Test
	public void jsonResponseValidationWithPreset() throws Exception {
		assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/api/v1/policies",
				String.class)).contains(resourceContent);
	}
	public String readFile(String path, Charset encoding) throws IOException
	{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}
}
