package com.rakeshgupta.spring.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakeshgupta.spring.security.model.Users;

/**
 * @author Rakesh_Gupta
 *
 */
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByName(String username);
}
