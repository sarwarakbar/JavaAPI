package com.API.Prize;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.fasterxml.jackson.core.type.TypeReference;

import com.fasterxml.jackson.databind.ObjectMapper;

import entity.Prize;

import service.PrizeService;


@ComponentScan({"controller","service"})
@EntityScan("entity")
@EnableJpaRepositories("repository")

@SpringBootApplication
public class PrizeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrizeApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(PrizeService prizeService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Prize>> typeReference = new TypeReference<List<Prize>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/prize.json");
			try {
				List<Prize> prizes = mapper.readValue(inputStream, typeReference);
				prizeService.saveAll(prizes);
				System.out.println("Prizes Saved!");
			} catch (IOException e){
				System.out.println("Unable to Prizes users: " + e.getMessage());
			}
		};
	
	}
	
	

}
