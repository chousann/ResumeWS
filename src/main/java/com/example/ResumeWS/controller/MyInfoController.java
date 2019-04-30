package com.example.ResumeWS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.ResumeWS.entity.MyInfo;
import com.example.ResumeWS.repository.MyInfoRepository;

import javax.servlet.http.HttpServletRequest;
@Controller
public class MyInfoController {
	
	@Autowired
	HttpServletRequest request;
	@Autowired
	MyInfoRepository myInfoRepository;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
    public MyInfo login(String loginId, String password) {
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
	
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(String otp) {
		
//		if (!loginCheck(request)) {
//			return "hello";
//		}
//		
//		if (!otp.equals("123456")) {
//			System.out.print("OTP error");
//			return "register";
//		}
//		
//		HttpSession session = request.getSession();
//		
//		String loginId = session.getAttribute("loginId").toString();
//		
//		MyInfo user = userRepository.findByLoginId(loginId);
//		if(user==null) {
//			System.out.print("user does not exits");
//			return "hello";
//		}
//		
//		ResumeItem device;// = deviceRepository.findByLoginIdAndDeviceUUID(loginId, user.getCurrentdeviceUUID());
//		device = new ResumeItem((long)123, user.getCurrentdeviceUUID());
//
//		List<ResumeItem> devices = user.getDevices();
//		devices.add(device);
//		user.setDevices(devices);
//		
//		userRepository.save(user);
//		
        return "top";
    }
}
