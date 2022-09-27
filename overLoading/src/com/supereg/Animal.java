package com.supereg;
//declaring class
public class Animal 
{
private String name;
private String color;

//default constructor
public Animal()
{
	super();
	// TODO Auto-generated constructor stub
}
//parmiterize constructor
public Animal(String name, String color)
{
	super();
	this.name = name;
	this.color = color;
}
//getter setter method
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
@Override
public String toString() {
	return "Animal [name=" + name + ", color=" + color + "]";
}




}
