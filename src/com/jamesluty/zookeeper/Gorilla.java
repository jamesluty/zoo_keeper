package com.jamesluty.zookeeper;

public class Gorilla extends Mammal {
	
	//	Constructors
	
	
	// other methods
	public void throwSomething(){
		System.out.println("Gorilla threw a rock");
		this.setEnergyLevel(this.getEnergyLevel() - 5);
	}
	
	public void eatBanans() {
		System.out.println("Mmmm, gorilla likes banana");
		this.setEnergyLevel(this.getEnergyLevel() + 10);
	}
	
	public void climb() {
		System.out.println("Gorilla climbed up a tree");
		this.setEnergyLevel(this.getEnergyLevel() - 10);
	}
}
