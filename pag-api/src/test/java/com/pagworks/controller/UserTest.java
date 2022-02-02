package com.pagworks.controller;

import static org.mockito.Mockito.when;

import org.apache.http.HttpStatus;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.pagworks.repository.UserRepository;

import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@WebMvcTest
public class UserTest {
	
	@Autowired
	private user user;
	
	@MockBean
	private UserRepository userRepository;
	
	@BeforeEach
	public void setup() {
		RestAssuredMockMvc.standaloneSetup(this.userRepository);
	}
	
	
	@Test
	public void deveCriarUsuario_ExecutandoFuncao() {
	
		RestAssuredMockMvc.given()
			.accept(ContentType.JSON)
		.when()
			.get("/user")
		.then()
			.statusCode(HttpStatus.SC_ACCEPTED);
		;
		
	}

}
