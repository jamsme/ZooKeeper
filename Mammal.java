package com.codingdojo.zookeeperone;

public class Mammal {
	Integer energyLevel = 100;
	
	public Integer displayEnergy() {
		System.out.println("Energy is " + energyLevel);
		return energyLevel;
	}
	
}
