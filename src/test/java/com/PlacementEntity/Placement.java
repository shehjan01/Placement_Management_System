package com.PlacementEntity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
@Entity
public class Placement {
		private long id;
		private String name;
		private College college;
		private LocalDate date;
		private String qualification;
		private int year;
		
		public Placement() {
			
		}

		public Placement(long id, String name, College college, LocalDate date, String qualification, int year) {
			this.id = id;
			this.name = name;
			this.college = college;
			this.date = date;
			this.qualification = qualification;
			this.year = year;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public College getCollege() {
			return college;
		}

		public void setCollege(College college) {
			this.college = college;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		@Override
		public String toString() {
			return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date
					+ ", qualification=" + qualification + ", year=" + year + "]";
		}
		
}
