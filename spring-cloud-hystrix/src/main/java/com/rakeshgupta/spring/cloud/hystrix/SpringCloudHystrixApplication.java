package com.rakeshgupta.spring.cloud.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Demonstration of circuit breaker hystrix and hystrix dashboard.
 * 
 * @author Rakesh_Gupta
 *
 */
@EnableCircuitBreaker
@EnableHystrixDashboard
@SpringBootApplication
public class SpringCloudHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudHystrixApplication.class, args);
	}
}
