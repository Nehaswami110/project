package com.ecourier.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import com.ecourier.entity.CourierDetails;
import com.ecourier.entity.CourierDetails1;
import com.ecourier.entity.CourierStatus;
import com.ecourier.exception.CourierNotFoundException;
import com.ecourier.repo.CourierDetailsRepo;
import com.ecourier.repo.CourierDetailsRepo1;
import com.ecourier.service.CourierDetailsService1;

@Service
public class CourierDetailsServiceImpl1 implements CourierDetailsService1 {

	@Autowired
	private CourierDetailsRepo1 repo1;

 

	@Override

	public CourierDetails1 updateCourierStatus(CourierDetails1 courierdetails1,CourierStatus status) {
		CourierDetails1 courier = new CourierDetails1();
		courier.setCourierId(courierdetails1.getCourierId());
		courier.setCustomerId(courierdetails1.getCustomerId());
		courier.setTrackingNumber(courierdetails1.getTrackingNumber());
		courier.setRecievedAt(courierdetails1.getRecievedAt());
		courier.setStatus(status);
		return repo1.saveAll(courier);
}

		@Override
		
		public CourierDetails1 checkCourierDetails(long courierId) throws CourierNotFoundException{
			Optional<CourierDetails1> courierDetails1 = repo1.findById(courierId);
		if(courierDetails1.isPresent()) {
		return courierDetails1.get();
		}
		else {
		throw new CourierNotFoundException("Courier Not Found");
		}
}

		@Override
		public List<CourierDetails1> viewAllCourier() {
		List<CourierDetails1> findAll = repo1.findAll();
		return findAll;
		}

		@Override
		public CourierDetails1 addCourierDetails(CourierDetails1 courierdetails1) {
			return repo1.save(courierdetails1);
		}



 

 

 

}