package com.fatou.survey1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatou.survey1.model.Survey;
import com.fatou.survey1.service.SurveyService;

@RestController
public class SurveyController {
	@Autowired
	private SurveyService diagne;
	
	@GetMapping("/surveys")
	public List<Survey> retrieveAllSurvey(){
		return diagne.retrieveAllSurveys();
	
		
	}

}
