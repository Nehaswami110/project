package com.ecourier.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ecourier.entity.CourierDetails;
import com.ecourier.entity.CourierStatus;
import com.ecourier.exception.CourierNotFoundException;
import com.ecourier.service.CourierDetailsService1;
@RestController
@RequestMapping("/courierdetails")
public class CourierDetailsController1 {
@Autowired
private CourierDetailsService1 service;
@PutMapping("/update")
public CourierDetails updateCourierStatus( @RequestBody  CourierDetails courierdetails, CourierStatus status) {
	CourierDetails details = this.service.updateCourierStatus(courierdetails, status);
    return details;

}
@GetMapping("/check/{courierid}")
public CourierDetails checkCourierDetails(@PathVariable("courierid")long courierId) throws CourierNotFoundException {
    CourierDetails check = this.service.checkCourierDetails(courierId);
    return check;
}

 

@PostMapping("/add")
public CourierDetails addCourierDetails(@RequestBody CourierDetails courierdetails ) {
    CourierDetails addCourierDetails = this.service.addCourierDetails(courierdetails);
    return addCourierDetails;

}
@GetMapping("/view")
public List<CourierDetails> viewAllCourier(){
    List<CourierDetails> viewAllCourier = this.service.viewAllCourier();
    return viewAllCourier;
}
}
