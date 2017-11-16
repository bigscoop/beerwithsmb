package ch.puzzle.jafakafi.intentions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IntentionsApplication.class)
@AutoConfigureMockMvc
@AutoConfigureStubRunner(ids = {"ch.puzzle.javakafi:buddies:+:stubs:8080"}, workOffline = true)
public class IntentionsTest {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void testValidIntention() throws Exception {

		mockMvc.perform(post("/intentions")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"buddy1\": \"Dima\", \"buddy2\": \"Simu\"}"))
				.andExpect(status().isOk());

	}

	@Test
	public void testInvalidIntention() throws Exception {

		mockMvc.perform(post("/intentions")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"buddy1\": \"Dima\", \"buddy2\": \"Tru\"}"))
				.andExpect(status().isNotFound());

	}

}
