package com.hniu.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-06-24 20:54
 */
public class Movie implements Serializable {
	private int mId;
	private String mName;
	private String mScreenDate;
	private long mHot;
	private float mGrade;
	private int mTime;
	private String mProfile;
	private String mDirector;
	private Integer mIsScreen;
	private String mImage;
	private List<Actor> actors;
	private List<MovieType> movieTypes;

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmScreenDate() {
		return mScreenDate;
	}

	public void setmScreenDate(String mScreenDate) {
		this.mScreenDate = mScreenDate;
	}

	public long getmHot() {
		return mHot;
	}

	public void setmHot(long mHot) {
		this.mHot = mHot;
	}

	public float getmGrade() {
		return mGrade;
	}

	public void setmGrade(float mGrade) {
		this.mGrade = mGrade;
	}

	public int getmTime() {
		return mTime;
	}

	public void setmTime(int mTime) {
		this.mTime = mTime;
	}

	public String getmProfile() {
		return mProfile;
	}

	public void setmProfile(String mProfile) {
		this.mProfile = mProfile;
	}

	public String getmDirector() {
		return mDirector;
	}

	public void setmDirector(String mDirector) {
		this.mDirector = mDirector;
	}

	public Integer getmIsScreen() {
		return mIsScreen;
	}

	public void setmIsScreen(Integer mIsScreen) {
		this.mIsScreen = mIsScreen;
	}

	public String getmImage() {
		return mImage;
	}

	public void setmImage(String mImage) {
		this.mImage = mImage;
	}

	public List<Actor> getActors() {
		return actors;
	}

	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}

	public List<MovieType> getMovieTypes() {
		return movieTypes;
	}

	public void setMovieTypes(List<MovieType> movieTypes) {
		this.movieTypes = movieTypes;
	}

	@Override
	public String toString() {
		return "Movie{" +
				"mId=" + mId +
				", mName='" + mName + '\'' +
				", mScreenDate='" + mScreenDate + '\'' +
				", mHot=" + mHot +
				", mGrade=" + mGrade +
				", mTime=" + mTime +
				", mProfile='" + mProfile + '\'' +
				", mDirector='" + mDirector + '\'' +
				", mIsScreen=" + mIsScreen +
				", mImage='" + mImage + '\'' +
				", actors=" + actors +
				", movieTypes=" + movieTypes +
				'}';
	}
}
