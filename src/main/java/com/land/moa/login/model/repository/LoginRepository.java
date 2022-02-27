package com.land.moa.login.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.land.moa.login.model.domain.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

}
