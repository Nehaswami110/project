package com.ecourier.service;

import java.util.List;
import java.util.List;
import com.ecourier.entity.CourierDetails;
import com.ecourier.entity.CourierDetails1;
import com.ecourier.entity.CourierStatus;
import com.ecourier.exception.CourierNotFoundException;
public interface CourierDetailsService1 {

 

public CourierDetails1 updateCourierStatus(CourierDetails1 courierdetails1, CourierStatus status);

public CourierDetails1 checkCourierDetails(long courierId) throws CourierNotFoundException;

public List<CourierDetails1> viewAllCourier();

public CourierDetails1 addCourierDetails(CourierDetails1 courierdetails1);

 

 

 

}