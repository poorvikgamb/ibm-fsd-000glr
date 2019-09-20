package com.project.demo.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Food {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String fUid;//generated randomly 
	
	private String image;//stores link of the image
	
	private String name;
	
	private Boolean category;
	@JsonIgnore
	@OneToMany(mappedBy = "food",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.REMOVE,CascadeType.REFRESH})
	private List<Cuisine> cuisine = new ArrayList<Cuisine>();
 	
	private String rUid;//dummy restaurant id	
}
