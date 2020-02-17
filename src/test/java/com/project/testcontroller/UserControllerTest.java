//package com.project.testcontroller;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.project.ApplicationTests;
//import com.project.omega.bean.User;
//import com.project.omega.controller.UserController;
//import com.project.omega.enums.RolesEnum;
//import com.project.omega.repository.UserRepository;
//import com.project.omega.service.UserService;
//import com.project.omega.service.UserServiceImpl;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.MediaType;
//import org.springframework.mock.web.MockHttpServletResponse;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.RequestBuilder;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import java.util.List;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(UserController.class)
//public class UserControllerTest extends ApplicationTests {
//    @Autowired
//    private MockMvc mvc;
//
//    @Autowired
//    private WebApplicationContext webApplicationContext;
//
//    @MockBean
//    private UserRepository userRepository;
//
//    @InjectMocks
//    private UserService userService = new UserServiceImpl();
//
//    ObjectMapper mapper = new ObjectMapper();
//
//    @Before
//    public void setup()
//    {
//        mvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//    }
//
//    @Test
//    @DisplayName("Test for creating new user.")
//    public void createUser_PositiveTest() throws Exception {
//        User user = new User.UserBuilder()
//                .setId("id2394839834134")
//                .setEmail("a@a.com")
//                .setPassword("password")
//                .setRole(RolesEnum.TEST_ROLE)
//                .build();
//        String userJson = null;
//        try {
//            userJson = mapper.writeValueAsString(user);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        Mockito.when(userRepository.save(Mockito.any(User.class))).thenReturn(user);
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .post("/user/create")
//                .accept(MediaType.APPLICATION_JSON).content(userJson)
//                .contentType(MediaType.APPLICATION_JSON);
//        MvcResult result = mvc.perform(requestBuilder).andReturn();
//        MockHttpServletResponse response = result.getResponse();
//        Assert.assertEquals(HttpStatus.OK, response.getStatus());
//    }
//
////    @Test
////    @DisplayName("Test for adding existing user.")
////    public void createUser_NegativeTest() {
////
////    }
//}
