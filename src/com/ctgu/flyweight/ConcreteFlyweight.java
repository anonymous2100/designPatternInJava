package com.ctgu.flyweight;

public class ConcreteFlyweight extends Flyweight
{
	private String string;

	public ConcreteFlyweight(String str)
	{
		string = str;
	}

	public void operation()
	{
		System.out.println("Concrete---Flyweight : " + string);
	}
}
