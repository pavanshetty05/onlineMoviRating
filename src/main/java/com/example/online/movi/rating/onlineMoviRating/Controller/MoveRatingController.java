package com.example.online.movi.rating.onlineMoviRating.Controller;

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

	@RequestMapping(value = "/rating", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody MoviRating addMoveDetails(@RequestBody MoviRating ouser) {

		return ouser;
	}

	@RequestMapping(value = "/rating", method = RequestMethod.GET, consumes = "application/json")
	public @ResponseBody MoviRating getMoveDetails(@PathVariable String moveID) {

		MoviRating ouserMapping = new MoviRating(moveID, null);
		return ouserMapping;
	}

	@RequestMapping(value = "/rating", method = RequestMethod.DELETE, consumes = "application/json")
	public @ResponseBody MoviRating removeDetails(@RequestBody MoviRating ouser) {

		return ouser;
	}

	@RequestMapping(value = "/rating", method = RequestMethod.PUT, consumes = "application/json")
	public @ResponseBody MoviRating updateMoveDetails(@RequestBody MoviRating ouser) {

		return ouser;
	}

}
