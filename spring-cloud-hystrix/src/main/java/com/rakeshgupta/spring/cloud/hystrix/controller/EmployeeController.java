/**
 * 
 */
package com.rakeshgupta.spring.cloud.hystrix.controller;

import org.apache.commons.lang.math.RandomUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author Rakesh_Gupta
 *
 */

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@HystrixCommand(fallbackMethod = "fallBackHello", commandKey = "hello", groupKey = "hello")
	@GetMapping("/hello")
	public String hello() {
		// Wrong
		if (RandomUtils.nextBoolean()) {
			throw new RuntimeException("Failed!");
		}
		return "Hello World";
	}

	@HystrixCommand(fallbackMethod = "fallBackHello", commandKey = "helloYT", groupKey = "helloYT")
	@GetMapping("/helloYT")
	public String helloYT() {
		// Wrong
		if (RandomUtils.nextBoolean()) {
			throw new RuntimeException("Failed!");
		}
		return "Hello World Youtube";
	}

	public String fallBackHello() {
		return "Fall Back Hello initiated";
	}
}
