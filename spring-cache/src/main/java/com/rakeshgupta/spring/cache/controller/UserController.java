/**
 * 
 */
package com.rakeshgupta.spring.cache.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakeshgupta.spring.cache.cacheddata.UsersCache;
import com.rakeshgupta.spring.cache.model.User;


/**
 * @author Rakesh_Gupta
 *
 */

@RestController
@RequestMapping(value = "/api/search")
public class UserController {

	@Autowired
	private UsersCache usersCache;

	@GetMapping(value = "/{name}")
	public User getUser(@PathVariable String name) {
		return usersCache.getUser(name);
	}
}
