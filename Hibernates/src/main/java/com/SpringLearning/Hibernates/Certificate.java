package com.SpringLearning.Hibernates;

import javax.persistence.Embeddable;

@Embeddable()
public class Certificate {
	private String couseName;
	private int Duration;

	public String getCouseName() {
		return couseName;
	}

	public void setCouseName(String couseName) {
		this.couseName = couseName;
	}

	public int getDuration() {
		return Duration;
	}

	public void setDuration(int duration) {
		Duration = duration;
	}
}
