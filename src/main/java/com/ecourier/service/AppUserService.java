package com.ecourier.service;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecourier.dto.LoginDTO;
import com.ecourier.entity.AppUser;
import com.ecourier.repo.AppUserRepo;
@Service
public class AppUserService{
	private AppUserRepo appUserRepo;
	@Autowired
	public AppUserService(AppUserRepo appUserRepo) {
		this.appUserRepo=appUserRepo;
	}
	public AppUser register(AppUser appUser) {
		return appUserRepo.save(appUser);
	}
	public AppUser login(String userName,String password) {
		AppUser  appUser=appUserRepo.findByUserName(userName);
		if(appUser!=null&&appUser.getPassword().equals(password)) {
			return appUser;
		}
		return null;
			
	}
}
=======
import com.ecourier.entity.AppUser;

public interface AppUserService{
	AppUser register(AppUser appUser);
	AppUser login(String userName,String password);
}





//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
// 
//
//import com.ecourier.entity.AppUser;
//import com.ecourier.repo.AppUserRepo;
//@Service
//public class AppUserService{
//    private AppUserRepo appUserRepo;
//    @Autowired
//    public AppUserService(AppUserRepo appUserRepo) {
//        this.appUserRepo=appUserRepo;
//    }
//    public AppUser register(AppUser appUser) {
//        return appUserRepo.save(appUser);
//    }
//    public AppUser login(String userName,String password) {
//        AppUser  appUser=appUserRepo.findByUserName(userName);
//        if(appUser!=null&&appUser.getPassword().equals(password)) {
//            return appUser;
//        }
//        return null;
//
//    }
//}
>>>>>>> 45d981bce19dd6b46d30ff144f5538fe29af02a2
