/*
 * Mark Szymanski
 * 1/16/2018
 * INFSCI 1017
 * Assignment 1
 * Fish.java
 */

package edu.pitt.helloanimals;

public class Fish extends Animal {
	
	public Fish(String age, String color, int weight, int minimumWeight) {
		super.Animal(age, color, "fish", weight, minimumWeight);
	}
	
	public int swim() {
		return (getWeight()-1);
	}
}