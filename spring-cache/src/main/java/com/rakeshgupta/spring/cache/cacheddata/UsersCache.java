/**
 * 
 */
package com.rakeshgupta.spring.cache.cacheddata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import com.rakeshgupta.spring.cache.model.User;
import com.rakeshgupta.spring.cache.repository.UserRepository;

/**
 * @author Rakesh_Gupta
 *
 */

@Component
public class UsersCache {

	@Autowired
	private UserRepository userRepository;

	 /**
	  * Actual caching will be done by this annotation. It will cache based on name.
	 * @param name for searching users from repository. 
	 * @return user if found in repository.
	 */
	@Cacheable(value = "usersCache", key = "#name")
	public User getUser(String name) {
		 System.out.println("Geting user for user name :: " + name);
		return userRepository.findByName(name); 
	}

}
