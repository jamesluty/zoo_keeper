package com.jamesluty.zookeeper;

public class TestMammal {

	public static void main(String[] args) {
		Gorilla james = new Gorilla();
		
		james.throwSomething();
		james.throwSomething();
		james.throwSomething();
		james.eatBanans();
		james.eatBanans();
		james.climb();
		System.out.println("Gorilla Energy Level: " + james.getEnergyLevel() + "\n");
		
		Bat giantBat = new Bat();
		giantBat.attackTown();
		giantBat.attackTown();
		giantBat.attackTown();
		giantBat.eatHumans();
		giantBat.eatHumans();
		giantBat.fly();
		giantBat.fly();
		System.out.println("Bat Energy Level: " + giantBat.getEnergyLevel() + "\n");
	}
}
