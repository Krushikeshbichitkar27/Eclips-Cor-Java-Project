package com.inherit;

public class MountainCycle extends Cycle {

private int noOfGears;
private double speed;
public MountainCycle(String string, int i, double d, String string2, int j, int k) {
	super();
	System.out.println("---Default Constructor of Mountain Cycle----");
	// TODO Auto-generated constructor stub
}

public MountainCycle(int noOfGears, double speed) {
	super();
	System.out.println("---Parameterize Constructor of Cycle----");
	this.noOfGears = noOfGears;
	this.speed = speed;
}
public MountainCycle() {
	// TODO Auto-generated constructor stub
}

public int getNoOfGears() {
	return noOfGears;
}
public void setNoOfGears(int noOfGears) {
	this.noOfGears = noOfGears;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
@Override
public String toString() {
	return "MountainCycle [noOfGears=" + noOfGears + ", speed=" + speed + "]";
}



}
