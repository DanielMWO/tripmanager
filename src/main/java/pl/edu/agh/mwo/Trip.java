package pl.edu.agh.mwo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Trip {
	public String name;
	public String description;
	protected List<Photo> photos = new ArrayList<Photo>();
	 
	public Trip (String name, String description) {
		this.name = name;
		this.description = description;
	}
	public List<Photo> getPhotos() {
		
		return photos;
	} 

	public void addPhoto(Photo photo) {
		this.photos.add(photo); 
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
