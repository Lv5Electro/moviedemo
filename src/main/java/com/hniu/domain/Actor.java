package com.hniu.domain;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-06-29 20:18
 */
public class Actor implements Serializable {
	private Integer aId;
	private String aName;

	public Integer getaId() {
		return aId;
	}

	public void setaId(Integer aId) {
		this.aId = aId;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	@Override
	public String toString() {
		return "Actor{" +
				"aId=" + aId +
				", aName='" + aName + '\'' +
				'}';
	}
}
