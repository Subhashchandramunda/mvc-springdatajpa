package com.dxc.shoppingcart.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="user")

public class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7047631688571835658L;
	/**
	 * 
	 */
	
	/**
	 * 
	 */
	
	
	@Id
	@Column(name="username",unique=true)
	private String username;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	private String password;
	private String email;
	@Column(name="mobileno")
	private Long mobileNo;
	private String roles;
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(String username, String firstName, String lastName, String password, String email, Long mobileNo,
			String roles) {
		super();
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
		this.mobileNo = mobileNo;
		this.roles = roles;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}


	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public User(User user) {
		this.username=user.getUsername();
		this.password=user.getPassword();
		this.firstName=user.getFirstName();
		this.lastName=user.getLastName();
		this.mobileNo=user.getMobileNo();
		this.email=user.getEmail();
		this.roles=user.getRoles();
		
	}


	
}
