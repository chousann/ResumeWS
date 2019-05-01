package com.example.ResumeWS.response;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import com.example.ResumeWS.entity.MyInfo;

public class ResponseModel {
	public ResponseModel() {
	}
	
	public ResponseModel(CommonData c, MyInfo a) {
		this.commonData = c;
		this.aplData = a;
	}
	
	private CommonData commonData;
	
	private MyInfo aplData;

	public CommonData getCommonData() {
		return commonData;
	}

	public void setCommonData(CommonData commonData) {
		this.commonData = commonData;
	}

	public MyInfo getAplData() {
		return aplData;
	}

	public void setAplData(MyInfo aplData) {
		this.aplData = aplData;
	}
	

}
