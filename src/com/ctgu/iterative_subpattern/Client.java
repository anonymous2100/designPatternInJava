package com.ctgu.iterative_subpattern;

/**
 * @ClassName: Client
 * @Description: 迭代器（Iterator）模式：提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
 * @author lh2
 * @date 2020年6月12日 下午5:05:35
 */
public class Client
{
	public void operation()
	{
		Object[] objArray = { "One", "Two", "Three", "Four", "Five", "Six" };
		// 创建聚合对象
		Aggregate agg = new ConcreteAggregate(objArray);
		// 循环输出聚合对象中的值
		Iterator it = agg.createIterator();
		while (!it.isDone())
		{
			System.out.println(it.currentItem());
			it.next();
		}
	}

	public static void main(String[] args)
	{
		Client client = new Client();
		client.operation();
	}

}
