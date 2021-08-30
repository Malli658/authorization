package com.ibm.authorization.dto;

import lombok.Getter;
import lombok.Setter;

import com.googlecode.jmapper.annotations.JGlobalMap;
import com.ibm.authorization.model.Gender;

@Setter
@Getter
@JGlobalMap
public class SignupDTO {
	
	private Gender gender;
	private String password;
	private String userName;
	private String email;
	private String userProfilePicLink;

}
