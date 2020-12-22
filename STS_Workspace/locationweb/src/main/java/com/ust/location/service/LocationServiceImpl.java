package com.ust.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.location.entities.Location;
import com.ust.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository respository;

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return respository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		// TODO Auto-generated method stub
		return respository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		respository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return respository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocattions() {
		// TODO Auto-generated method stub
		return (List<Location>) respository.findAll();
	}

	public LocationRepository getRespository() {
		return respository;
	}

	public void setRespository(LocationRepository respository) {
		this.respository = respository;
	}

}
