package com.land.moa.login.dtos;

import lombok.Data;

@Data
public class LoginReq {
	private String userId;
	private String userPassword;
}
