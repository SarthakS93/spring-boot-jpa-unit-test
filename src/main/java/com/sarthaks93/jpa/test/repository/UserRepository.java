package com.sarthaks93.jpa.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthaks93.jpa.test.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
