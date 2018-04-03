package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.List;

public class TripManager {

	protected List<Trip> trips = new ArrayList <Trip>();

	public void addTrip(Trip trip) {
		this.trips.add(trip);
		
	}

	public void removeTrip(Trip trip) {
		
		this.trips.remove(trip);
		
	}

	public List<Trip> getTrips() {
		// TODO Auto-generated method stub
		return this.trips;
	}
	

	
	
	
}