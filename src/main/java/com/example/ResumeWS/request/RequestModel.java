package com.example.ResumeWS.request;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.example.ResumeWS.entity.MyInfo;

public class RequestModel {
	public RequestModel() {
	}
	
	private String loginId;
	
	private String password;

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
