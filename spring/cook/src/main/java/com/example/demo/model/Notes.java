package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Notes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long notesId;
	
	@OneToOne
	private Receipe receipe;
	
	private String receipeNotes;

	public Long getNotesId() {
		return notesId;
	}

	public void setNotesId(Long notesId) {
		this.notesId = notesId;
	}

	public Receipe getReceipe() {
		return receipe;
	}

	public void setReceipe(Receipe receipe) {
		this.receipe = receipe;
	}

	public String getReceipeNotes() {
		return receipeNotes;
	}

	public void setReceipeNotes(String receipeNotes) {
		this.receipeNotes = receipeNotes;
	}
	
}
