/**
 * 
 */
package com.rakeshgupta.spring.cache.repository;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rakeshgupta.spring.cache.model.User;

/**
 * @author Rakesh_Gupta
 *
 */

@Component
public class UsersData {

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void load() {
		userRepository.saveAll(getUsersList());
	}

	/**
	 *  Hard coding list of users to avoid unnecessary database overhead.
	 * @return
	 */
	private List<User> getUsersList() {

		List<User> users = new ArrayList<>();
		users.add(new User("pawan", "ignite", 45000L));
		users.add(new User("ajay", "ignite", 40000L));
		users.add(new User("altaf", "ignite", 35000L));
		return users;
	}
}
