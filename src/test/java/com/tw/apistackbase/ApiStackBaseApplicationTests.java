package com.tw.apistackbase;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc


public class ApiStackBaseApplicationTests {
	@Autowired
	private MockMvc mockMvc;
//	@Test
//	public void shouldReturnAllEmployee() throws Exception {
//		this.mockMvc.perform(get("/employees")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("1 zhangsan male,2 xiaofang female.")));
//
//	}
//	@Test
//	public void shouldReturnAEmployee() throws Exception {
//		this.mockMvc.perform(get("/employees/1")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("1 zhangsan male.")));

//	}
//	@Test
//	public void shouldReturnPageEmployee() throws Exception {
//		this.mockMvc.perform(get("/employees/?Page=0&size=1")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("1 zhangsan male,2 xiaofang female.")));
//
//	}
	@Test
	public void shouldDeleteEmployee() throws Exception {
		this.mockMvc.perform(delete("/employees/1")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("2 xiaofang female.")));

	}
	@Test
	public void shouldPutEmployee() throws Exception {
		this.mockMvc.perform(put("/employees/1")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("1 zhangsan female.2 xiaofang female.")));

	}
	}


