package com.hrmsSystem.hrmsSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hrmsSystem.hrmsSystem.entities.abstracts.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employers")
public class Employer implements User{
	

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "eMail")
	private String eMail;
	
	@Column(name = "telephone")
	private long telephone;
	
	@Column(name = "password")
	private long password;
	
	@Column(name = "passwordAgain")
	private long passwordAgain;

}
