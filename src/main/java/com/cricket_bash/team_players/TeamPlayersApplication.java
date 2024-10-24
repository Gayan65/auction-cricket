package com.cricket_bash.team_players;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeamPlayersApplication {

	public static void main(String[] args) {

		SpringApplication.run(TeamPlayersApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return  new ModelMapper();
	}

}

