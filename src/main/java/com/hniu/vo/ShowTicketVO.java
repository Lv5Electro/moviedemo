package com.hniu.vo;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-07-06 21:10
 */

public class ShowTicketVO implements Serializable {
	private Integer tkId;
	private Integer sId;
	private String mName;
	private Integer tkSeat;
	private String tkDate;

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

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
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
		return "ShowTicketVO{" +
				"tkId=" + tkId +
				", sId=" + sId +
				", mName='" + mName + '\'' +
				", tkSeat=" + tkSeat +
				", tkDate='" + tkDate + '\'' +
				'}';
	}
}
