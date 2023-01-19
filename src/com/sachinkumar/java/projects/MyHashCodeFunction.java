package com.sachinkumar.java.projects;

import java.math.BigDecimal;


public class MyHashCodeFunction {

	private int id;
	private String name;
	private BigDecimal mobile;

	public MyHashCodeFunction(int id, String name, BigDecimal mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o == null) {
			return false;
		}
		if(this.getClass() != o.getClass()) {
			return false;
		}
		MyHashCodeFunction a = (MyHashCodeFunction) o;

		return this.id == a.id && this.name.equals(a.name) && this.mobile.compareTo(a.mobile) == 0;
	}

	public int hashCode() {
		return (int) id*name.hashCode()*mobile.hashCode();
	}

	public static void main(String[] args) {		

		MyHashCodeFunction sachin = new MyHashCodeFunction(1,"Sachin",new BigDecimal("9028790749"));
		MyHashCodeFunction ashwini = new MyHashCodeFunction(2,"Ashwini",new BigDecimal("9834533141"));
		MyHashCodeFunction sachin1 = new MyHashCodeFunction(1,"Sachin",new BigDecimal("9028790749"));

		if(sachin.equals(ashwini))
			System.out.println("Sachin == Ashwini");
		else
			System.out.println("Sachin <> Ashwini");

		if(sachin.equals(sachin1)) {
			System.out.println("Sachin == Sachin1");
		}else {
			System.out.println("Sachin <> Sachin1");
		}
		System.out.println("Hash codes = " + sachin.hashCode() + "-"+ ashwini.hashCode() +"-"+sachin1.hashCode());

	}

}
