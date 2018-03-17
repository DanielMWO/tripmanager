package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Assert.*;
import org.junit.Test;

public class TripManagerTest {
	
	@Test
	public void addPhotoTest() {
		Trip trip = new Trip();
		Photo photo = new Photo("Nowe");
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
		
		
	}
	
	


	@Test
	public void addTripTest() {
		TripManager tripManager = new TripManager();
		assertEquals(0, tripManager.getTrip().size());
		tripManager.addTrip();
		assertEquals(1, tripManager.getTrip().size());
		
		
		
		
				
	}
	
	@Test 
	public void testPhotoName() {
		Photo photo = new Photo("Nowe");
		assertEquals("Nowe", photo.comment);
	
	}
	
}
