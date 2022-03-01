package com.land.moa.login.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.land.moa.login.dtos.LoginReq;
import com.land.moa.login.dtos.LoginRes;
import com.land.moa.login.model.domain.Login;
import com.land.moa.login.model.repository.LoginRepository;
import com.land.moa.login.service.LoginService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

	private final PasswordEncoder passwordEncoder;
	private final LoginRepository loginRepository;

	@Override
	public LoginRes chkLogin(LoginReq dto) {
		Login login = new Login();
		login.setUserId(dto.getUserId());
		login.setUserPassword(passwordEncoder.encode(dto.getUserPassword()));
		loginRepository.save(login);
		LoginRes res = new LoginRes(login);
		return res;

	}

}
