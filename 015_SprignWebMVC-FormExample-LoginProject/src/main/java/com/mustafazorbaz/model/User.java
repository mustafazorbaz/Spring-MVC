package com.mustafazorbaz.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
public class User {
	 
@NotEmpty(message="Bu alan bo� ge�ilemez")
@Size (min = 1, max = 100 ,message="Kullan�c� ad� 1 ile 100 karakter aras�nda olmal�d�r")	
private String userName;

@NotEmpty(message="Bu alan bo� ge�ilemez")
@Size (min = 1, max = 100 ,message="Email 1 ile 100 karakter aras�nda olmal�d�r")	
private String email;
@NotEmpty(message="Bu alan bo� ge�ilemez")
@Size (min = 1, max = 8,message="Parola 1 ile 8 aras�nda olmal�d�r")
private String password;

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}


}
