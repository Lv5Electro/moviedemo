package com.hniu.domain;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 20:36
 */
public class Ticket implements Serializable {
	private Integer tkId;
	private Integer sId;
	private Integer mId;
	private Integer uId;
	private Integer tkSeat;
	private String tkDate;
	private Movie movie;
	private Studio studio;

	public Integer getTkId() {
		return tkId;
	}

	public void setTkId(Integer tkId) {
		this.tkId = tkId;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public Integer getmId() {
		return mId;
	}

	public void setmId(Integer mId) {
		this.mId = mId;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public Integer getTkSeat() {
		return tkSeat;
	}

	public void setTkSeat(Integer tkSeat) {
		this.tkSeat = tkSeat;
	}

	public String getTkDate() {
		return tkDate;
	}

	public void setTkDate(String tkDate) {
		this.tkDate = tkDate;
	}

	@Override
	public String toString() {
		return "Ticket{" +
				"tkId=" + tkId +
				", sId=" + sId +
				", mId=" + mId +
				", uId=" + uId +
				", tkSeat=" + tkSeat +
				", tkDate='" + tkDate + '\'' +
				'}';
	}
}
