package com.heranca.exemplo;

public class NPC {
	private double life;
	private double xp;
	
	NPC(){}
	
	NPC(double life, double xp){
		this.life = life;
		this.xp = xp;
	}
	
	public double getLife() {
		return life;
	}
	
	public void setLife(double life) {
		this.life = life;
	}
	
	public double getXp() {
		return xp;
	}
	
	public void setXp(double xp) {
		this.xp = xp;
	}
	
	
	public void move(double x, double y){
		System.out.println("Move versão 1...d");
	}
	
	public void move(double x, double y, double acceleration){
		System.out.println("Move versão 2 com aceleração...");
	}
	
	public void seek(NPC target){}
	
	public void flee(NPC target){
		System.out.println("Flee da classe NPC");
	}
	
}
