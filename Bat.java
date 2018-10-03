package com.codingdojo.zookeeperone;

public class Bat extends Mammal{
	
	public Bat() {
		this.energyLevel = 300;
	};
	
	public void fly() {
		energyLevel -= 50;
		System.out.println("I'm flying " + energyLevel);
	};
	
	public void eatHumans() {
		energyLevel += 25;
		System.out.println("Ate a human " + energyLevel);
	};
	
	public void attackTown() {
		energyLevel -= 100;
		System.out.println("Town is on fire " + energyLevel);
	};
	
}
