package com.hniu.domain;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-07-02 9:34
 */
public class FilmSchedule implements Serializable {
	private Integer fId;
	private String fDate;

	public Integer getfId() {
		return fId;
	}

	public void setfId(Integer fId) {
		this.fId = fId;
	}

	public String getfDate() {
		return fDate;
	}

	public void setfDate(String fDate) {
		this.fDate = fDate;
	}

	@Override
	public String toString() {
		return "FilmSchedule{" +
				"fId=" + fId +
				", fDate='" + fDate + '\'' +
				'}';
	}
}
