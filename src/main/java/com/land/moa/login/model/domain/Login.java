package com.land.moa.login.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity(name = "BAS_LOGIN")
public class Login {
	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "USER_PASSWORD", nullable = false)
	private String userPassword;

	// Java의 날짜 타입
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_TIME")
	private Date insertTime;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME")
	private Date updateTime;

}
