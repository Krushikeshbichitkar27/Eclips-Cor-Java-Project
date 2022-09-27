package com.supereg;
//inherit class 
public class Dog extends Animal
{
private String color;
private String bread;
//default constructor
public Dog() 
{
	super();
	// TODO Auto-generated constructor stub
}
//parameterize constructor
public Dog(String color, String bread)
{
	super();
	this.color = color;
	this.bread = bread;
}

//getter setter method
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
