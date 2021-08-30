package com.ibm.authorization.model;

import com.googlecode.jmapper.annotations.JGlobalMap;

import lombok.Data;

@Data
@JGlobalMap
public class UserView {
	private String id;

    private String userName;
    private String email;
}
