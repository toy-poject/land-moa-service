package com.land.moa.login.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.land.moa.login.dtos.LoginDTO;
import com.land.moa.login.model.domain.Login;
import com.land.moa.login.model.repository.LoginRepository;
import com.land.moa.login.service.LoginService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class LoginServiceImpl implements LoginService {

	private final PasswordEncoder passwordEncoder;
	private final LoginRepository loginRepository;

	@Override
	public Login chkLogin(LoginDTO dto) {
		log.info(dto.getUserId());
		log.info("인코딩 전 : " + dto.getUserPassword());
		dto.setUserPassword(passwordEncoder.encode(dto.getUserPassword()));
		log.info("인코딩 함 : " + dto.getUserPassword());
		Login login = new Login();
		login.setUserId(dto.getUserId());
		login.setUserPassword(dto.getUserPassword());
		loginRepository.save(login);
		return login;

	}

}
