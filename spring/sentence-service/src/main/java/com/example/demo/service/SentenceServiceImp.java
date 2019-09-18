package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SentenceServiceImp implements SentenceService {
	
	@Autowired
	WordService wordService;

	@Override
	public String buildSentence() {
		// TODO Auto-generated method stub
		return String.format("%s %s %s %s %s", 
				wordService.getSubject().getWord(),
				wordService.getVerb().getWord(),
				wordService.getArticle().getWord(),
				wordService.getAdjectice().getWord(),
				wordService.getNoun().getWord()
				);
	}

}
