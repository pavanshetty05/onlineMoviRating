package com.example.online.movi.rating.onlineMoviRating.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.online.movi.rating.onlineMoviRating.Module.MoviRating;

@RestController
@RequestMapping(value = "/movi")
public class MoveRatingController {
	
	Logger log = 
	        LoggerFactory.getLogger(MoveRatingController.class);

	@RequestMapping(value = "/rating", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody MoviRating addMoveDetails(@RequestBody MoviRating ouser) {
		
		log.info("Add move");

		return ouser;
	}

	@RequestMapping(value = "/rating", method = RequestMethod.GET)
	public @ResponseBody MoviRating getMoveDetails() {
		
		log.info("Get move");

		MoviRating ouserMapping = new MoviRating();
		ouserMapping.setMoveID("pavan");
		ouserMapping.setMoverating("pavan");
		return ouserMapping;
	}

	@RequestMapping(value = "/rating", method = RequestMethod.DELETE, consumes = "application/json")
	public @ResponseBody MoviRating removeDetails(@RequestBody MoviRating ouser) {

		log.info("Remove move");
		return ouser;
	}

	@RequestMapping(value = "/rating", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody MoviRating updateMoveDetails(@RequestBody MoviRating ouser) {
		
		log.info("Update move");

		return ouser;
	}

}
