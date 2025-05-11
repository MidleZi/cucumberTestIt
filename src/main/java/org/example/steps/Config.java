package org.example.steps;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;

@CucumberContextConfiguration
@SpringBootTest(classes = Config.class)
@ComponentScan("org.example")
public class Config {
}
