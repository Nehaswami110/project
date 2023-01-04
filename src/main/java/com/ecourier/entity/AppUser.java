package com.ecourier.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

<<<<<<< HEAD
@Entity
public class AppUser {

=======
 

@Entity
public class AppUser {

 

>>>>>>> 45d981bce19dd6b46d30ff144f5538fe29af02a2
@Id
private String userid;
private String userName;
private String password;
private long mobileNumber;

<<<<<<< HEAD
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "AppUser [userid=" + userid + ", userName=" + userName + ", password=" + password + ", mobileNumber="
			+ mobileNumber + "]";
}
public AppUser(String userid, String userName, String password, long mobileNumber) {
	super();
	this.userid = userid;
	this.userName = userName;
	this.password = password;
	this.mobileNumber = mobileNumber;
}
public AppUser() {
	super();
	// TODO Auto-generated constructor stub
}

}
=======
 

public String getUserid() {
    return userid;
}
public void setUserid(String userid) {
    this.userid = userid;
}
public String getUserName() {
    return userName;
}
public void setUserName(String userName) {
    this.userName = userName;
}
public String getPassword() {
    return password;
}
public void setPassword(String password) {
    this.password = password;
}
public long getMobileNumber() {
    return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
    this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
    return "AppUser [userid=" + userid + ", userName=" + userName + ", password=" + password + ", mobileNumber="
            + mobileNumber + "]";
}
public AppUser(String userid, String userName, String password, long mobileNumber) {
    super();
    this.userid = userid;
    this.userName = userName;
    this.password = password;
    this.mobileNumber = mobileNumber;
}
public AppUser() {
    super();
    // TODO Auto-generated constructor stub
}

 

}
>>>>>>> 45d981bce19dd6b46d30ff144f5538fe29af02a2
