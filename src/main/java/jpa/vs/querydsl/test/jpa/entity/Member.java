package jpa.vs.querydsl.test.jpa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue
	private long id;
	
	public Member() {
	}
	
	private String name;
	private String address;
	
	public Member(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
