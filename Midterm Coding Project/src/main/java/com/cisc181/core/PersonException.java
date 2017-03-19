package com.cisc181.core;

public class PersonException extends Throwable{
	private Person A;
	
	public PersonException(Person a){
		this.A = a;
	}
	
	public Person getPerson(){
		return A;
	}
}
