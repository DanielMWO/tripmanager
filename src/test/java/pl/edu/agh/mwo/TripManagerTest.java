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
	Photo permPhoto;
	TripManager permTripM;
	Trip permTrip;
	@Before  
	public void setUp() throws Exception {
		permPhoto = new Photo("Stale");
		permTripM = new TripManager();
		permTrip = new Trip("Stala wycieczka", "Permanentna wycieczka do testowania");
}
	@Test 
	public void testNewPhoto() {
		Photo photo = new Photo ("Foto");
		assertNotNull(photo);
			}

	@Test 
	public void testNewPhotoComment() {
		Photo photo = new Photo("Nowe");
		assertEquals("Nowe", photo.comment);
	}
	
	@Test 
	public void testGetNewPhotoComment() {
		Photo photo = new Photo("Nowe");
		assertEquals("Nowe", photo.getComment());
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
	public void testNewTrip() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		assertNotNull(trip);

	}

	@Test 
	public void testNewTripName() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		assertEquals("Wycieczka",trip.name );
		
	}
		
	
	@Test 
	public void testNewTripDescription() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		assertEquals("All Ilcsusive",trip.description );
		
	}

	@Test 
	public void testGetNewTripDescription() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		assertEquals("All Ilcsusive",trip.getDescription() );
	}
	

	@Test 
	public void testSetNewTripName() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		trip.setName("Mega Wycieczka");
		assertEquals("Mega Wycieczka",trip.getName());
		
	}

	@Test 
	public void testGetNewTripDescriptiom() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		trip.setDescription("B&B");
		assertEquals("B&B",trip.getDescription());
		
	}
	
	
	
	
	@Test 
	public void addPhoto() {
		Trip trip3 = new Trip ("Wycieczka","All Ilcsusive");
		trip3.addPhoto(permPhoto);
		assertEquals(1, trip3.photos.size());
	}
	
	@Test 
	public void getPhotos() {
		Trip trip4 = new Trip ("Wycieczka","All Ilcsusive");
		Photo photo = new Photo("Nowe");
		Photo photo2 = new Photo("Nowe2");
		trip4.addPhoto(permPhoto);
		trip4.addPhoto(photo);
		trip4.addPhoto(photo2);
		assertEquals(3, trip4.getPhotos().size());
	}
	
// TripManager Tests
	
	@Test
	public void newTripManager() {
		TripManager tripMInstance = new TripManager();
			assertNotNull(tripMInstance);
	}

	@Test
	public void addTrip() {
		permTripM.addTrip(permTrip);
		assertEquals(1, permTripM.trips.size());
	}
	@Test
	public void removeNonExistingTrip() {
		permTripM.removeTrip(permTrip);
		assertEquals(0, permTripM.trips.size());
	}
	@Test
	public void removeExistigTrip() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		permTripM.addTrip(trip);
		permTripM.addTrip(permTrip);
		permTripM.removeTrip(permTrip);
		assertEquals(1, permTripM.trips.size());
	}
	@Test
	public void getTripsList() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		permTripM.addTrip(trip);
		permTripM.addTrip(permTrip);
		assertEquals(2, permTripM.getTrips().size());
	}
	
	
}
