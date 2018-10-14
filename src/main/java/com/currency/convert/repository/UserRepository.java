package com.currency.convert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.convert.model.User;

/**
 * @author Deepak dwivedi repository
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

	public User findByusername(String username);

	public User findByemail(String email);

}
