package controllers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by patri on 6/20/2017.
 * Basic first example tests for the Greeting Controller
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstTest {

    @Autowired
    private GreetingController controller;

    @Test
    public void controllerLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

}
