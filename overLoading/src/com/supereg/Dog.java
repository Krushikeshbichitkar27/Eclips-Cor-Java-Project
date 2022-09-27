package com.supereg;

public class Dog extends Animal
{
private String color;
private String bread;
public Dog() {
	super();
	// TODO Auto-generated constructor stub
}
public Dog(String color, String bread) {
	super();
	this.color = color;
	this.bread = bread;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getBread() {
	return bread;
}
public void setBread(String bread) {
	this.bread = bread;
}
@Override
public String toString() {
	return "Dog [color=" + color + ", bread=" + bread + "]";
}


}
