package com.currency.convert.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.currency.convert.model.Role;


/**
 * @author Deepak dwivedi repository
 *
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
	public Role findByRole(String role);
}
