package com.mustafazorbaz.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
public class User {
	@NotEmpty
	@Size(min=1,max=25,message="Bu alan 1 den büyük 25 den küçük olmalýdýr.")
private String name;
	@NotEmpty
	@Size(min=1,max=25,message="Bu alan 1 den büyük 25 den küçük olmalýdýr.")
private String surname;
	
private String email;

@NotNull
@NumberFormat(style = Style.NUMBER)
@Min(1)
@Max(150)
private String yas;

@NotEmpty(message="Lütfen parolayý giriniz !")
@Size(min=1,max=50,message="Bu alan 1 ile 50 karakter arasýnda olmalýdýr.")
private String parola;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSurname() {
	return surname;
}

public void setSurname(String surname) {
	this.surname = surname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getYas() {
	return yas;
}

public void setYas(String yas) {
	this.yas = yas;
}

public String getParola() {
	return parola;
}

public void setParola(String parola) {
	this.parola = parola;
}



}
