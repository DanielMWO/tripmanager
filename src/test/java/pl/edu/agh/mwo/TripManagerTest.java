package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

import org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TripManagerTest {
	
	
	@Test 
	public void testnewPhotoComment() {
		Photo photo = new Photo("Nowe");
		assertEquals("Nowe", photo.getComment());
		}
	
	Photo permPhoto;
	
	@Before  
	public void setUp() throws Exception {
		permPhoto = new Photo("Stale");
		
	}
	@Test 
	public void testPhotoComment() {
		assertEquals("Stale", permPhoto.getComment());
			}
	
	@Test 
	public void testSetPhotoComment() {
		permPhoto.setComment("Zmienione");
		assertEquals("Zmienione", permPhoto.getComment());
	}
	
	//Trip Tests



	@Test 
	public void testnewTrip() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		assertNotNull(trip);
	}

	
	@Test 
	public void addPhoto() {
		Trip trip3 = new Trip ("Wycieczka","All Ilcsusive");
		trip3.addPhoto(permPhoto);
		assertEquals(1, trip3.photos.size());
	}
	
}
