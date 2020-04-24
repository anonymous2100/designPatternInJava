package com.ctgu.flyweight;

import java.util.HashMap;

// 在1处定义了一个HashMap用来存储各个对象；
// 在2处选出要实例化的对象，
// 在6处将该对象返回，如果在HashMap中没有要选择的对象，
// 此时变量flyweight为null，产生一个新的flyweight存储在HashMap中，并将该对象返回。
public class FlyweightFactory
{
	private HashMap flyweights = new HashMap();// ----------------------------1

	public FlyweightFactory()
	{
	}

	public Flyweight getFlyWeight(Object obj)
	{
		Flyweight flyweight = (Flyweight) flyweights.get(obj);// ----------------2
		if (flyweight == null)
		{// ---------------------------------------------------3
			// 产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String) obj);
			flyweights.put(obj, flyweight);// --------------------------------------5
		}
		return flyweight;// ---------------------------------------------------------6
	}

	public int getFlyweightSize()
	{
		return flyweights.size();
	}
}
