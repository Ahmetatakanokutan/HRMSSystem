package com.hrmsSystem.hrmsSystem.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.hrmsSystem.hrmsSystem.entities.abstracts.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker implements User{

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "surName")
	private String surName;
	
	@Column(name = "tcNo")
	private long tcNo;
	
	@Column(name = "birthDay")
	private String birthDay;
	
	@Column(name = "eMail")
	private String eMail;
	
	@Column(name = "password")
	private String password;
}
