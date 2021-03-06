package io.github.zp1024.spring.mvc.data;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;

import io.github.zp1024.spring.mvc.data.custom.CustomArgumentController;
import io.github.zp1024.spring.mvc.data.custom.CustomArgumentResolver;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

public class CustomArgumentControllerTests {
	private MockMvc mockMvc;

	@Before
	public void setup() throws Exception {
		this.mockMvc = standaloneSetup(new CustomArgumentController())
				.setCustomArgumentResolvers(new CustomArgumentResolver()).build();
	}

	@Test
	public void param() throws Exception {
		this.mockMvc.perform(get("/data/custom"))
				.andExpect(content().string("Got 'foo' request attribute value 'bar'"));
	}

}
