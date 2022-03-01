package com.land.moa.login.service;

import com.land.moa.login.dtos.LoginReq;
import com.land.moa.login.dtos.LoginRes;

public interface LoginService {
	public LoginRes chkLogin(LoginReq login);
}
