package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1, 1);
	}
	
	@Test
	public void MeanSalary() {
		ArrayList<Staff> staffing = new ArrayList<Staff>();
		
		Staff Phill = new Staff("Phill", "Mc", "Phillerson", null, "I don't know",
				"(123)-456-7890", "Maybe@Udel.edu", "Never", 2, 10, null, eTitle.MR);
		staffing.add(Phill);
		Staff Bill = new Staff("Bill", "Mc", "Billerson", null, "I don't know",
				"(123)-456-7890", "Maybe@Udel.edu", "Never", 3, 20, null, eTitle.DR);
		staffing.add(Bill);
		Staff Jill = new Staff("Jill", "Mc", "Jillerson", null, "I don't know",
				"(123)-456-7890", "Maybe@Udel.edu", "Never", 4, 30, null, eTitle.MS);
		staffing.add(Jill);
		Staff Dill = new Staff("Dill", "Mc", "Dillerson", null, "I don't know",
				"(123)-456-7890", "Maybe@Udel.edu", "Never", 5, 40, null, eTitle.PROFESSOR);
		staffing.add(Dill);
		Staff Nill = new Staff("Nill", "Mc", "Nillerson", null, "I don't know",
				"(123)-456-7890", "Maybe@Udel.edu", "Never", 6, 50, null, eTitle.MRS);
		staffing.add(Nill);
		
		int salAccum = 0;
		int total = 0;
		for(Staff alpha : staffing){
			salAccum += alpha.getSalary();
			total += 1;
		}
		int meanSal = (salAccum / total);
		
		assertEquals(meanSal, 30);
	}
	
	@Test
	public void  ExceptionsPhone() throws PersonException{
		
	}
	
	@Test
	public void  ExceptionsBirth() throws PersonException{
		Staff Bob = new Staff("Bob", "Arthor", "TheThird", null, "Somewhere niceish", 
				"(123)-456-7890", "Maybe@udel.edu", "Always", 5, 60, null, eTitle.DR);
	}
}
