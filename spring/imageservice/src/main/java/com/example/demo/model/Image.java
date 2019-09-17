package com.example.demo.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Image {
	
	private long imageId;
	private String description;
	private String url;
	public Image(long imageId, String description, String url) {
		super();
		this.imageId = imageId;
		this.description = description;
		this.url = url;
	}
}
