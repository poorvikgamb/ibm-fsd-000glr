package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AdjectiveClient;
import com.example.demo.dao.ArticleClient;
import com.example.demo.dao.NounClient;
import com.example.demo.dao.SubjectClient;
import com.example.demo.dao.VerbClient;
import com.example.demo.model.Word;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class WordServiceImp implements WordService{
	
	@Autowired
	NounClient nounClient;
	
	@Autowired
	VerbClient verbClient;
	
	@Autowired
	ArticleClient articleClient;
	
	@Autowired
	AdjectiveClient adjectiveClient;
	
	@Autowired
	SubjectClient subjectClient;


	@Override
	@HystrixCommand(fallbackMethod = "getSubjectFallBack")
	public Word getNoun() {
		// TODO Auto-generated method stub
		return nounClient.getWord();
	}

	@Override
	public Word getVerb() {
		// TODO Auto-generated method stub
		return verbClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getAjectiveFallBack")
	public Word getAdjectice() {
		// TODO Auto-generated method stub
		return adjectiveClient.getWord();
	}

	@Override
	public Word getArticle() {
		// TODO Auto-generated method stub
		return articleClient.getWord();
	}

	@Override
	@HystrixCommand(fallbackMethod = "getSubjectFallBack")
	public Word getSubject() {
		// TODO Auto-generated method stub
		return subjectClient.getWord();
	}
	
	public Word getSubjectFallBack()
	{
		return new Word("subject");
	}
	
	public Word getNounFallBack()
	{
		return new Word("noun");
	}

	public Word getAjectiveFallBack()
	{
		return new Word("adjective");
	}
}
