package com.example.ResumeWS.entity;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table

public class MyInfo implements Serializable{
	public MyInfo() {
	}
	public MyInfo(Long i,String name,String url) {
		this.id = i;
		this.loginId = name;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 32)
    private String loginId;
    
    @Column(length = 32)
    private String password;
    
    @Column(length = 32)
    private String name;
    
    @Column(length = 32)
    private String sex;
    
    @Column(length = 32)
    private String birth;
    
    @Column(length = 32)
    private String age;
    
    @Column(length = 32)
    private String address;
    
    @Column(length = 32)
    private String phone;
    
    @Column(length = 32)
    private String email;
    
    @Column(length = 32)
    private String wechat;
    
    @Column(length = 32)
    private String github;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "loginId", referencedColumnName="loginId")
    private List<education> education;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "loginId", referencedColumnName="loginId")
    private List<job> job;

	@OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "loginId", referencedColumnName="loginId")
    private List<project> project;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "loginId", referencedColumnName="loginId")
    private List<skill> skill;
    
    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "loginId", referencedColumnName="loginId")
    private List<intention> intention;

    @OneToMany(cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "loginId", referencedColumnName="loginId")
    private List<selfevaluation> selfevaluation;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getGithub() {
		return github;
	}
	public void setGithub(String github) {
		this.github = github;
	}
	public List<education> getEducation() {
		return education;
	}
	public void setEducation(List<education> education) {
		this.education = education;
	}
	public List<job> getJob() {
		return job;
	}
	public void setJob(List<job> job) {
		this.job = job;
	}
	public List<project> getProject() {
		return project;
	}
	public void setProject(List<project> project) {
		this.project = project;
	}
	public List<skill> getSkill() {
		return skill;
	}
	public void setSkill(List<skill> skill) {
		this.skill = skill;
	}
	public List<intention> getIntention() {
		return intention;
	}
	public void setIntention(List<intention> intention) {
		this.intention = intention;
	}
	public List<selfevaluation> getSelfevaluation() {
		return selfevaluation;
	}
	public void setSelfevaluation(List<selfevaluation> selfevaluation) {
		this.selfevaluation = selfevaluation;
	}

}
