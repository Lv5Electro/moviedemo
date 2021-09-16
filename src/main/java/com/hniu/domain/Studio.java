package com.hniu.domain;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 9:34
 */
public class Studio implements Serializable {
	private Integer sId;
	private Integer sNum;
	private String sGrade;

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public Integer getsNum() {
		return sNum;
	}

	public void setsNum(Integer sNum) {
		this.sNum = sNum;
	}

	public String getsGrade() {
		return sGrade;
	}

	public void setsGrade(String sGrade) {
		this.sGrade = sGrade;
	}

	@Override
	public String toString() {
		return "Studio{" +
				"sId=" + sId +
				", sNum=" + sNum +
				", sGrade='" + sGrade + '\'' +
				'}';
	}
}
