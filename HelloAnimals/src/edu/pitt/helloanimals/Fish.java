package edu.pitt.helloanimals;

public class Fish extends Animal {
	
	public Fish(String age, String color, String type, int weight, int minimumWeight) {
		
	}
	
	public int swim() {
		return (getWeight()-1);
	}
}
