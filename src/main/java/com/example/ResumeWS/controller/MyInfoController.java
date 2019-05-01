package com.example.ResumeWS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import com.example.ResumeWS.entity.MyInfo;
import com.example.ResumeWS.repository.MyInfoRepository;
import com.example.ResumeWS.request.RequestModel;
import com.example.ResumeWS.response.CommonData;
import com.example.ResumeWS.response.ResponseModel;

import javax.servlet.http.HttpServletRequest;
@Controller
@CrossOrigin
public class MyInfoController {
	
	@Autowired
	HttpServletRequest request;
	@Autowired
	MyInfoRepository myInfoRepository;
	@CrossOrigin
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
    public MyInfo login(@RequestBody RequestModel model) {
		String loginId = model.getLoginId();
		String password = model.getPassword();
		
		System.out.print("loginid:"+loginId+"\npassword:"+password+"\n");
		
		if(loginId == null || loginId.isEmpty()) {
			loginId = "defaultid";
		}
		
		MyInfo myinfo = myInfoRepository.findByLoginIdAndPassword(loginId,password);
		if(myinfo==null) {
			System.out.print("user does not exits");
			return myinfo;
		}

        return myinfo;
    }
	
	@CrossOrigin
	@RequestMapping(value = "/getinfo", method = RequestMethod.POST)
//	@ResponseBody
	@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public ResponseEntity<ResponseModel> getInfo(@RequestBody RequestModel model) {
		
		String loginId = model.getLoginId();
		String password = model.getPassword();
		
		System.out.print("loginid:"+loginId+"\npassword:"+password+"\n");
		
		if(loginId == null || loginId.isEmpty()) {
			loginId = "defaultid";
		}
		
		CommonData cd = new CommonData();
		
		MyInfo myinfo = myInfoRepository.findByLoginIdAndPassword(loginId,password);
		if(myinfo==null) {
			System.out.print("user does not exits");
			cd.setStatus("404");
			return ResponseEntity.ok(new ResponseModel(cd,myinfo));
		}

		cd.setStatus("200");
        return ResponseEntity.ok(new ResponseModel(cd,myinfo));
    }
}
