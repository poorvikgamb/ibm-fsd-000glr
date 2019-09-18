package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SentenceService;

@RestController
public class SentenceController {

	@Autowired
	SentenceService sentenceService;
	
	@GetMapping("/sentence")
	public @ResponseBody String getSentence()
	{
		String sentence = "<h3>sentence are</h3>"+
	sentenceService.buildSentence()+"<br/><br/>"+
	sentenceService.buildSentence()+"<br/><br/>"+
	sentenceService.buildSentence()+"<br/><br/>"+
	sentenceService.buildSentence()+"<br/><br/>"+
	sentenceService.buildSentence()+"<br/><br/>";
		
		return sentence;
		
	}
	
}
