package com.codingdojo.zookeeperone;

public class Gorilla extends Mammal {
	
	public void throwSomething() {
		energyLevel -= 5;
		System.out.println("Throwing something " + energyLevel);
	};
	
	public void eatBanannas() {
		energyLevel += 10;
		System.out.println("Yummy banannas! " + energyLevel);
	};
	
	public void climb() {
		energyLevel -= 10;
		System.out.println("Climbing a tree " + energyLevel);
	};
	
}
