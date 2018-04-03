package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TripManager {

	protected List<Trip> trips = new ArrayList <Trip>();

	public void addTrip(Trip trip) {
		this.trips.add(trip);
		
	}

	public void removeTrip(Trip trip) {
		
		this.trips.remove(trip);
		
	}

	public List<Trip> getTrips() {
		return this.trips;
	}

	public List<Trip> findTrip(String keyword) {
		List<Trip> result = this.trips.stream().filter(t -> t.name.toString().toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toList());
		List<Trip> result2 = this.trips.stream().filter(t -> t.description.toString().toLowerCase().contains(keyword.toLowerCase())).collect(Collectors.toList());
		result.removeAll(result2);
		result.addAll(result2);
	    return result;
	}
	

	
	
	
}