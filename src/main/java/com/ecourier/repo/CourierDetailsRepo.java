package com.ecourier.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecourier.entity.CourierDetails;
import com.ecourier.entity.CourierStatus;

@Repository
public interface CourierDetailsRepo extends JpaRepository<CourierDetails,Long > {
	List<CourierDetails> findByStatus(CourierStatus status);
}
