package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Demo1 {
	@Id    
    public int id;
    public int age;
	private String name;
    public String bloodgroup;
	public String healthcondition;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	public String getHealthcondition() {
		return healthcondition;
	}
	public void setHealthcondition(String healthcondition) {
		this.healthcondition = healthcondition;
	}

    
    
    
}
