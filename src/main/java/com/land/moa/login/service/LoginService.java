package com.land.moa.login.service;

import com.land.moa.login.dtos.LoginDTO;
import com.land.moa.login.model.domain.Login;

public interface LoginService {
	public Login chkLogin(LoginDTO login);
}
