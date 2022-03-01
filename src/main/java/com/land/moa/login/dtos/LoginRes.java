package com.land.moa.login.dtos;

import com.land.moa.login.model.domain.Login;

import lombok.Data;

@Data
public class LoginRes {
	private String userId;
	private String userPassword;

	public LoginRes(Login login) {
		this.userId = login.getUserId();
		this.userPassword = login.getUserPassword();
	}
}
