package com.land.moa.login.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.land.moa.login.dtos.LoginReq;
import com.land.moa.login.model.domain.Login;
import com.land.moa.login.service.LoginService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class LoginController {

	private final LoginService loginService;

	@GetMapping("/login")
	public ResponseEntity<Login> partyLoginInfo(@RequestParam("id") String id, @RequestParam("pw") String password) {
		LoginReq login = new LoginReq();
		login.setUserId(id);
		login.setUserPassword(password);
		return new ResponseEntity(loginService.chkLogin(login), HttpStatus.OK);
	}

//	@PostMapping("/login")
//	public ResponseEntity<Map<String, Object>> partyLogin(@RequestBody Login login) {
//		return new ResponseEntity(loginService.chkLogin(login), HttpStatus.OK);
//	}
}
