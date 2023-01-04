package com.ecourier.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecourier.entity.CourierDetails;
import com.ecourier.entity.CourierStatus;
import com.ecourier.repo.CourierDetailsRepo;
import com.ecourier.service.CourierDetailsService;

@Service
public class CourierDetailsServiceImpl implements CourierDetailsService{
	@Autowired
	private CourierDetailsRepo courierDetailsRepo;

	@Override
	public List<CourierDetails> viewCourierByStatus(CourierStatus status) {
		return courierDetailsRepo.findByStatus(status);
	}
	@Override
	public CourierDetails updateCourierStatus(long trackingNumber, CourierStatus status) {
		CourierDetails courierDetails = this.courierDetailsRepo.findById(trackingNumber).get();
		CourierDetails courier = new CourierDetails();
		courier.setCustomerId(courierDetails.getCustomerId());
		courier.setReceivedAt(courierDetails.getReceivedAt());
		courier.setStatus(status);
		courier.setTrackingNumber(trackingNumber);
		return courierDetailsRepo.save(courier);
		
	}
	@Override
	public CourierDetails trackCourier(long trackingNumber) {
		
		return courierDetailsRepo.findById(trackingNumber).orElseThrow();
	}
	@Override
	public CourierDetails addCourierDetails(CourierDetails courierDetails) {
		// TODO Auto-generated method stub
		return courierDetailsRepo.save(courierDetails);
	}
	
}