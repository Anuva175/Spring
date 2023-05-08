package com.example.EducationalLoan.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="LoginTable")
public class LoginModel {
    @Id
	private int LoginId;
	private String Email;
	private String Password;
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getLoginId() {
		return LoginId;
	}
	public void setLoginId(int loginId) {
		LoginId = loginId;
	}
	
	
}
