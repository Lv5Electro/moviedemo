package com.hniu.domain;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-06-29 20:33
 */
public class MovieType implements Serializable {
	private Integer tId;
	private String tName;

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	@Override
	public String toString() {
		return "MovieType{" +
				"tId=" + tId +
				", tName='" + tName + '\'' +
				'}';
	}
}
