package com.cisc181.core;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setup() {
		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		SimpleDateFormat date1 = new SimpleDateFormat("MM/dd/yyyy");
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(new Course(UUID.randomUUID(), "Advanced BS tactics", 4));
		courses.add(new Course(UUID.randomUUID(), "Remedial Whistling", 2));
		courses.add(new Course(UUID.randomUUID(), "Conspiracies 101", 1));
		
		ArrayList<Semester> semesters = new ArrayList<Semester>();
		String FallStartDate = "2016-08-20 00:00:00.0";
		String FallEndDate = "2016-12-20 00:00:00.0";
		String SpringStartDate = "2016-02-04 00:00:00.0";
		String SpringEndDate = "2016-6-20 00:00:00.0";
		
		try {
			Date FS = date.parse(FallStartDate);
			Date FE = date.parse(FallEndDate);
			Date SS = date.parse(SpringStartDate);
			Date SE = date.parse(SpringEndDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		semesters.add(new Semester(UUID.randomUUID(), null, null));
		semesters.add(new Semester(UUID.randomUUID(), null, null));
		
		ArrayList<Section> sections = new ArrayList<Section>();
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 0));
		sections.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 0));
		
		ArrayList<Student> students = new ArrayList<Student>();
		Student A = new Student("A", "A", "A", null, eMajor.COMPSI,
				"Somewhere inexpensive", "(098)-765-4321", "InnapropriateStudent@hotmail.com");
		Student B = new Student("B", "B", "B", null, eMajor.NURSING ,
				"Somewhere inexpensive", "(098)-765-4322", "BoringStudent@AOL.com");
		Student C = new Student("C", "C", "C", null, eMajor.CHEM ,
				"Somewhere inexpensive", "(098)-765-4323", "CCC@udel.com");
		Student D = new Student("D", "D", "D", null, eMajor.BUSINESS ,
				"Somewhere inexpensive", "(098)-765-4324", "StopLookingAtMe@tmomail.com");
		Student E = new Student("E", "E", "E", null, eMajor.COMPSI,
				"Somewhere inexpensive", "(098)-765-4325", "drugreference@hotmail.com");
		Student F = new Student("F", "F", "F", null, eMajor.NURSING ,
				"Somewhere inexpensive", "(098)-765-4326", "BoringStudent@AOL.com");
		Student G = new Student("G", "G", "G", null, eMajor.PHYSICS ,
				"Somewhere inexpensive", "(098)-765-4327", "FandomTrash@gmail.com");
		Student H = new Student("H", "H", "H", null, eMajor.CHEM ,
				"Somewhere inexpensive", "(098)-765-4328", "boringPerson@udel.com");
		Student I = new Student("I", "I", "I", null, eMajor.BUSINESS ,
				"Somewhere inexpensive", "(098)-765-4329", "words@tmomail.com");
		Student J = new Student("J", "J", "J", null, eMajor.PHYSICS ,
				"Somewhere inexpensive", "(098)-765-4320", "AAAAHHH@gmail.com");
	}

	@Test
	public void test() {
		assertEquals(1, 1);
	}
	
	@Test
	public void MajorChange(){
//		J.setMajor(eMajor.CHEM);
//		assertEquals(j.getMajor, eMajor.CHEM);
	}
}