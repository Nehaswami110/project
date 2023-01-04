package com.ecourier.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
=======
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> 45d981bce19dd6b46d30ff144f5538fe29af02a2
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
import com.ecourier.dto.LoginDTO;
import com.ecourier.entity.AppUser;
import com.ecourier.service.AppUserService;

@RestController
@RequestMapping("/api/appuser")
public class AppUserController {
	
	private AppUserService appUserService;
	@Autowired 
	public AppUserController(AppUserService appUserService) {
		this.appUserService=appUserService;
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<AppUser> register(@Valid @RequestBody AppUser appUser){
		AppUser newAppUser=appUserService.register(appUser);
		return ResponseEntity.ok(newAppUser);
	}
	@PostMapping("/login")
	public ResponseEntity<AppUser> login(@Valid @RequestBody LoginDTO loginDTO){
		AppUser appUser=appUserService.login(loginDTO.getUsername(),loginDTO.getPassword());
		return ResponseEntity.ok(appUser);
	}
}	
		
		
		
		
=======
import com.ecourier.entity.AppUser;
import com.ecourier.service.AppUserService;
@RestController
@RequestMapping("/users")
public class AppUserController{
	@Autowired
	private AppUserService appUserService;
	
	@PostMapping("/register")
	public AppUser register(@RequestBody AppUser appUser) {
		return appUserService.register(appUser);
	}
	
	@PostMapping("/login")
	public AppUser login(@RequestBody Map<String, String> request) {
		String userName = request.get("userName");
		String password = request.get("password");
		return appUserService.login(userName, password);
	}
}
































//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
// 
//
//import com.ecourier.dto.LoginDTO;
//import com.ecourier.entity.AppUser;
//import com.ecourier.service.AppUserService;
//
// 
//
//@RestController
//@RequestMapping("/api/appuser")
//public class AppUserController {
//
//    private AppUserService appUserService;
//    @Autowired 
//    public AppUserController(AppUserService appUserService) {
//        this.appUserService=appUserService;
//    }
//
//
//    @PostMapping("/register")
//    public ResponseEntity<AppUser> register(@Valid @RequestBody AppUser appUser){
//        AppUser newAppUser=appUserService.register(appUser);
//        return ResponseEntity.ok(newAppUser);
//    }
//    @PostMapping("/login")
//    public ResponseEntity<AppUser> login(@Valid @RequestBody LoginDTO loginDTO){
//        AppUser appUser=appUserService.login(loginDTO.getUsername(),loginDTO.getPassword());
//        return ResponseEntity.ok(appUser);
//    }
//}    
>>>>>>> 45d981bce19dd6b46d30ff144f5538fe29af02a2
