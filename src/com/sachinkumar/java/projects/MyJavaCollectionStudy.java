package com.sachinkumar.java.projects;

import java.util.ArrayList;
import java.util.List;

public class MyJavaCollectionStudy {
	
	private List<String> animals = new ArrayList();
	
	public MyJavaCollectionStudy(List<String> animals) {
		this.animals=animals;
	}
	
	private void printAnimals(List<String> animals) {
		for(String animal : animals) {
			System.out.println(animal);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> animals = new ArrayList();
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Rat");
		animals.add("Cock");
		MyJavaCollectionStudy col1 = new MyJavaCollectionStudy(animals);
		col1.printAnimals(animals);

	}

}
