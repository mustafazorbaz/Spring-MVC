package com.mustafazorbaz.model;

import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotEmpty;
public class User {
	 
@NotEmpty(message="Bu alan boþ geçilemez")
@Size (min = 1, max = 100 ,message="Kullanýcý adý 1 ile 100 karakter arasýnda olmalýdýr")	
private String userName;

@NotEmpty(message="Bu alan boþ geçilemez")
@Size (min = 1, max = 100 ,message="Email 1 ile 100 karakter arasýnda olmalýdýr")	
private String email;
@NotEmpty(message="Bu alan boþ geçilemez")
@Size (min = 1, max = 8,message="Parola 1 ile 8 arasýnda olmalýdýr")
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
