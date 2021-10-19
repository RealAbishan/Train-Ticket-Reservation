package com.example.trainticketreservation.Controller;


import com.example.trainticketreservation.Dtos.UserDto;
import com.example.trainticketreservation.Service.SignUpService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SignUpControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private SignUpService signUpService;

    @Test
    public void signUpTest() throws Exception {

        UserDto userDto = new UserDto();

        HttpHeaders httpHeaders = new HttpHeaders();

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .post("/signup")
                .headers(httpHeaders)
                .content(new ObjectMapper().writeValueAsBytes(userDto))
                .contentType(MediaType.APPLICATION_JSON);


        when(signUpService.addPartner(userDto));

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals(HttpStatus.OK.value(), result.getResponse().getStatus());
    }
}
