package com.example.ResumeWS.entity;
import javax.persistence.*;

@Entity
@Table

public class skill {
	public skill() {
	}
	public skill(Long i, String url) {
		this.id = i;
		//this.loginId = name;
	}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
//    @Column(length = 32)
//    private String loginId;
    
    @Column(length = 32)
    private String index;
    
    @Column(length = 32)
    private String type;
    
    @Column(length = 256)
    private String descri;


	public void setId(Long id) {
		this.id = id;
	}
//	public String getLoginId() {
//		return loginId;
//	}
//	public void setLoginId(String loginId) {
//		this.loginId = loginId;
//	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescri() {
		return descri;
	}
	public void setDescri(String descri) {
		this.descri = descri;
	}
}
