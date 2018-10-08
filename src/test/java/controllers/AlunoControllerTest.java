package controllers;


import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class AlunoControllerTest {
	
	@Autowired
	private WebApplicationContext context;
	
	private MockMvc mvc;
	
	String url = "/alunos/59320492";
	
	@Before
	public void setup() {
		this.mvc = MockMvcBuilders.webAppContextSetup(this.context).build();
	}
	
	@Test
	public void testeRequisicao() throws Exception {
		this.mvc.perform(get(url))
		.andExpect(status().isOk())
		.andExpect(jsonPath("nome",equalTo("carlos eduardo")));
	}


}
