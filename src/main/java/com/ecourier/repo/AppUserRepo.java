package com.ecourier.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.ecourier.entity.AppUser;

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Long>{
 AppUser findByUserName(String userName);
}
=======
 

import com.ecourier.entity.AppUser;

 

@Repository
public interface AppUserRepo extends JpaRepository<AppUser,Long>{
AppUser findByUserName(String userName);
}
>>>>>>> 45d981bce19dd6b46d30ff144f5538fe29af02a2
