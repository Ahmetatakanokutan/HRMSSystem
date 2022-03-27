package com.hrmsSystem.hrmsSystem.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.hrmsSystem.hrmsSystem.entities.abstracts.User;

import lombok.Data;

@Entity
@Data
public class SystemPersonel implements User{

	@Id
	@Column(name = "id")
	private int id;

}
