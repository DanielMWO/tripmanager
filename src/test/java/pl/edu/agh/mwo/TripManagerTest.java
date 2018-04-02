package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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
	
	Photo photo2;
	
	@Before  
	public void setUp()throws Exception {
		 photo2 = new Photo("Stale");
	}	
	
	@Test 
	public void testPhotoComment() {
		assertEquals("Stale", photo2.getComment());
			}
	
	@Test 
	public void testSetPhotoComment() {
		photo2.setComment("Zmienione");
		assertEquals("Zmienione", photo2.getComment());
	}
	
	
}
