package com.ecourier.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecourier.entity.CourierDetails;
import com.ecourier.entity.CourierStatus;
import com.ecourier.service.CourierDetailsService;

@RestController
@RequestMapping("/tracking")
public class CourierDetailsController {
	@Autowired
	public CourierDetailsService courierDetailsService;

	@PostMapping("/adddetails")
	public CourierDetails addCourierDetails(CourierDetails courierDetails) {
		return courierDetailsService.addCourierDetails(courierDetails);
	}
	@GetMapping("/courier/{status}")
	public List<CourierDetails> viewCourierByStatus(@PathVariable CourierStatus status){
		return courierDetailsService.viewCourierByStatus(status);
	}
	
	@PutMapping("/status/{trackingNumber}")
	public void updateCourierStatus(@PathVariable long trackingNumber,@RequestParam CourierStatus status) {
		courierDetailsService.updateCourierStatus(trackingNumber, status);
	}
	
	@GetMapping("/track/{trackingNumber}")
	public CourierDetails trackCourier(@PathVariable long trackingNumber) {
		return courierDetailsService.trackCourier(trackingNumber);
	}
}














































































































