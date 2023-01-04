//package com.ecourier.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.ecourier.dto.LoginDTO;
//import com.ecourier.entity.AppUser;
//import com.ecourier.repo.AppUserRepo;
//
//@Service
//public class AppUserServiceImpl implements AppUserService {
//	
//	@Autowired 
//	private AppUserRepo repo;
//	
//	@Override
//	public AppUser validate(LoginDTO dto) {
//		AppUser appuser=repo.findById(dto.getUserid()).orElse(null);
//		if(appuser!=null && appuser.getPassword().equals(dto.getPassword()))
//			return appuser;
//		return null;
//		
//	}
//	@Override
//	public void register(AppUser appuser) {
//		if(repo.count()==0)
//				repo.save(appuser);
//	}
//	
//
//}
