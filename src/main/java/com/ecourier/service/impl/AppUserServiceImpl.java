package com.ecourier.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecourier.entity.AppUser;
import com.ecourier.repo.AppUserRepo;
import com.ecourier.service.AppUserService;

public class AppUserServiceImpl implements AppUserService {
	@Autowired
	private AppUserRepo appUserRepo;

	@Override
	public AppUser register(AppUser appUser) {
		return appUserRepo.save(appUser);
	}

	@Override
	public AppUser login(String userName, String password) {
		AppUser appUser = appUserRepo.findByUserName(userName);
		if(appUser!=null && appUser.getPassword().equals(password)) {
		return appUser;
	}
	return null;
	}
}
