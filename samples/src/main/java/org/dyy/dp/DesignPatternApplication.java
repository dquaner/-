package org.dyy.dp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DesignPatternApplication.class, args);
        System.out.println(run.getBean("sheep") == run.getBean("sheep"));
    }

}
