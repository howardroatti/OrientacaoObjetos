package com.heranca.exemplo;

public class Warrior extends NPC {
	private double armor;
	
	public double getArmor(){
		return this.armor;
	}

	Warrior(){
		super();
		this.armor = 200;
	}
	
	@Override
	public void flee(NPC target){
		super.flee(target);
		System.out.println("Flee do Warrior");
	}
	
}
