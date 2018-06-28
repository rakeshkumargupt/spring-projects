/**
 * 
 */
package com.rakeshgupta.spring.cache.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakeshgupta.spring.cache.model.User;

/**
 * @author Rakesh_Gupta
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);
}
