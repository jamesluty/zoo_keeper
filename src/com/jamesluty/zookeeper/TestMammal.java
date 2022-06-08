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
		System.out.println("Energy Level: " + james.getEnergyLevel() + "\n");

	}

}
