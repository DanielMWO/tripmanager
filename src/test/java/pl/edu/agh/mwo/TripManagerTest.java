package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {
	Photo permPhoto;
	TripManager permTripM;
	Trip permTrip;
	@Before  
	public void setUp() throws Exception {
		permPhoto = new Photo("Stale");
		permTripM = new TripManager();
		permTrip = new Trip("Stala Wycieczka", "Permanentna wycieczka do testowania All");
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
	@Test
	public void findOneTripsInList() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		permTripM.addTrip(trip);
		permTripM.addTrip(permTrip);
		assertEquals(1, permTripM.findTrip("Stala").size());
	}
	
	@Test
	public void findNoneTripsInList() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		permTripM.addTrip(trip);
		permTripM.addTrip(permTrip);
		assertEquals(0, permTripM.findTrip("Inne").size());
	}
	
	@Test
	public void findTwoTripsInList() {
		Trip trip = new Trip ("Wycieczka","All Ilcsusive");
		Trip trip2 = new Trip ("Wycieczka","Bed and Breakfast");
		permTripM.addTrip(trip);
		permTripM.addTrip(trip2);
		permTripM.addTrip(permTrip);
		assertEquals(2, permTripM.findTrip("all").size());
	}
	@Test
	public void findNonDuplicatesInDescriptionTripsInList() {
		Trip trip = new Trip  ("Wycieczka"," Wycieczka all Ilcsusive");
		Trip trip2 = new Trip ("Wyjazd"," Wycieczka Bed and Breakfast");
		Trip trip3 = new Trip ("Wyjazd","Bed and Breakfast");
		Trip trip4 = new Trip ("Wycieczka","Bed and Breakfast");
		Trip trip5 = new Trip ("Wycieczka","Bed and Breakfast Wycieczka");
		permTripM.addTrip(trip);
		permTripM.addTrip(trip2);
		permTripM.addTrip(trip3);
		permTripM.addTrip(trip4);
		permTripM.addTrip(trip5);
		assertEquals(4, permTripM.findTrip("Wycieczka").size());
	}
	
}
