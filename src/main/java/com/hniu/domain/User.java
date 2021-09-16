package com.hniu.domain;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 9:01
 */
public class User implements Serializable {
	private Integer uId;
	private String uNickName;
	private String uName;
	private String uPassword;
	private String uPhone;
	private String uEmail;

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public String getuNickName() {
		return uNickName;
	}

	public void setuNickName(String uNickName) {
		this.uNickName = uNickName;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getuPassword() {
		return uPassword;
	}

	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}

	public String getuPhone() {
		return uPhone;
	}

	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}

	public String getuEmail() {
		return uEmail;
	}

	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}

	@Override
	public String toString() {
		return "User{" +
				"uId=" + uId +
				", uNickName='" + uNickName + '\'' +
				", uName='" + uName + '\'' +
				", uPassword='" + uPassword + '\'' +
				", uPhone='" + uPhone + '\'' +
				", uEmail='" + uEmail + '\'' +
				'}';
	}
}
