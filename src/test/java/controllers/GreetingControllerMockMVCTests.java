package controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


/**
 * Created by patrick on 6/20/2017.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerMockMVCTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void baseRouteReturnsSomething() throws Exception {
        this.mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("Hello, World!")));
    }

    @Test
    public void nameParameterShowsUpInResult() throws Exception {
        this.mockMvc.perform(get("/?name=patrick"))
                .andExpect(content().string(containsString("Hello, patrick")));
    }
}
