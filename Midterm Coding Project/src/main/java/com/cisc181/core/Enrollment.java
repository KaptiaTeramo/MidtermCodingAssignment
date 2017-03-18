package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private Double Grade;
	
	public Enrollment() {
		super();
	}

	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		EnrollmentID = UUID.randomUUID();
	}

	public void setGrade(Double grade) {
		Grade = grade;
	}
	
	
	
}
