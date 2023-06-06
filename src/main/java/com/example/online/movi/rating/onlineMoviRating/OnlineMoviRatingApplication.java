package com.example.online.movi.rating.onlineMoviRating;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlineMoviRatingApplication {

	public static void main(String[] args) {
		Logger log = 
		        LoggerFactory.getLogger(OnlineMoviRatingApplication.class);
		SpringApplication.run(OnlineMoviRatingApplication.class, args);
	}

}
