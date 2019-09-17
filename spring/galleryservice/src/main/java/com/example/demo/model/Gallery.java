package com.example.demo.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Gallery {
	private long galleryId;
	private List<Object> images;
	public long getGalleryId() {
		return galleryId;
	}
	public void setGalleryId(long galleryId) {
		this.galleryId = galleryId;
	}
	public List<Object> getImages() {
		return images;
	}
	public void setImages(List<Object> images) {
		this.images = images;
	}
	
	
}
