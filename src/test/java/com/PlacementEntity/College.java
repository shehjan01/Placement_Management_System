package com.PlacementEntity;

import jakarta.persistence.Entity;

@Entity
public class College {
	private long id;
	private User collegeAdmin;
	private String collegeName;
	private String location;
	
	public College() {
		
	}

	public College(long id, User collegeAdmin, String collegeName, String location) {
		this.id = id;
		this.collegeAdmin = collegeAdmin;
		this.collegeName = collegeName;
		this.location = location;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getCollegeAdmin() {
		return collegeAdmin;
	}

	public void setCollegeAdmin(User collegeAdmin) {
		this.collegeAdmin = collegeAdmin;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "College [id=" + id + ", collegeAdmin=" + collegeAdmin + ", collegeName=" + collegeName + ", location="
				+ location + "]";
	}
	
}
