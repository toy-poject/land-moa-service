package com.land.moa.login.model.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity(name = "BAS_LOGIN")
public class Login {
	@Id
	@Column(name = "USER_ID")
	private String userId;

	@Column(name = "USER_PASSWORD", nullable = false)
	private String userPassword;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "INSERT_TIME", updatable = false)
	private Date insertTime;

	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATE_TIME", updatable = true)
	private Date updateTime;

}
