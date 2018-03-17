package pl.edu.agh.mwo;

import org.junit.Assert.*;

public class TripManagerTest {
	
	@Test
	public void addPhotoTest {
		Trip trip = new Trip();
		Photo photo = new Photo();
		assertEguals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEguals(1, trip.getPhotos().size());
		
		
		
	}
	
}
