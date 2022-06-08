package com.jamesluty.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super();
		this.energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("Whoosh whoosh whoosh");
		this.setEnergyLevel(this.getEnergyLevel() - 50);
	}
	
	public void eatHumans() {
		System.out.println("Crunch crunch, Mmmm yummy");
		this.setEnergyLevel(this.getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("Ahhh everything is on fire");
		this.setEnergyLevel(this.getEnergyLevel() - 100);
	}
}
