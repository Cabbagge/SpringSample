package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(Application ctx) {
        return args -> {
            System.out.println("Mama mo din");

            // String[] beansName = ctx.getBeanDefinitionNames();
            // Arrays.sort(beansName);
            // for (String beanName : beansName)
            // {
            //     System.out.println(beanName);
            // }
        };
    }

}