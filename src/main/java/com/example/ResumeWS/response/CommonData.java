package com.example.ResumeWS.response;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.example.ResumeWS.entity.MyInfo;

public class CommonData {
	public CommonData() {
	}
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
