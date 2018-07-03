package com.rakeshgupta.spring.security.resource;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controllers for checking authorization of user.
 * 
 * @author Rakesh_Gupta
 *
 */
@RequestMapping("/rest/hello")
@RestController
public class HelloResourceController {

	@GetMapping("/all")
	public String hello() {
		return "Hello Google";
	}

	@PreAuthorize("hasAnyRole('ADMIN')")
	@GetMapping("/secured/all")
	public String securedHello() {
		return "Secured Hello";
	}

	@GetMapping("/secured/alternate")
	public String alternate() {
		return "alternate";

	}
}
