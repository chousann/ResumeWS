package com.example.ResumeWS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ResumeWS.entity.MyInfo;

public interface MyInfoRepository extends JpaRepository<MyInfo, Long> {
	MyInfo findByLoginIdAndPassword(String loginId, String password);
//	MyInfo findByLoginId(String loginId);
}
