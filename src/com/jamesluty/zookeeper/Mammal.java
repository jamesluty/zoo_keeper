package com.jamesluty.zookeeper;

public class Mammal {
	private Integer energyLevel;
	
	// Constructors	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}

	//	Getters and setters
	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}
}
