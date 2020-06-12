package com.ctgu.flyweight;

/**
 * @ClassName: ConcreteFlyweight
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:01:03
 */
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
