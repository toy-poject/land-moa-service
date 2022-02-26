package com.land.moa.login.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.land.moa.login.model.domain.Login;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

	private final PasswordEncoder passwordEncoder;

	@Override
	public Login chkLogin(Login login) {
		log.info(login.getUserId());
		log.info("인코딩 전 : " + login.getUserPassword());
		login.setUserPassword(passwordEncoder.encode(login.getUserPassword()));
		log.info("인코딩 함 : " + login.getUserPassword());
		return login;

	}

}
