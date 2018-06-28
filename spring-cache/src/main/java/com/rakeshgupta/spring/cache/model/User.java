/**
 * 
 */
package com.rakeshgupta.spring.cache.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Rakesh_Gupta
 *
 */

/**
 * @author Rakesh_Gupta
 *
 */
@Entity
public class User implements Serializable{

	private static final long serialVersionUID = -2659436822871171846L;

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String teamName;
	private Long salary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public User(String name, String teamName, Long salary) {
		super();
		this.name = name;
		this.teamName = teamName;
		this.salary = salary;
	}

	public User() {
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", teamName=" + teamName + ", salary=" + salary + "]";
	}
}
