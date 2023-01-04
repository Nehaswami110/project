package com.ecourier.service;

import java.util.List;

import com.ecourier.entity.CourierDetails;
import com.ecourier.entity.CourierStatus;

public interface CourierDetailsService{
	CourierDetails addCourierDetails(CourierDetails courierDetails);
	List<CourierDetails> viewCourierByStatus(CourierStatus status);
	CourierDetails updateCourierStatus(long trackingNumber,CourierStatus status);
	CourierDetails trackCourier (long trackingNumber);
}



























































