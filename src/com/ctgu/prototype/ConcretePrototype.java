package com.ctgu.prototype;

/**
 * @ClassName: ConcretePrototype
 * @Description:原型模式实现类：:实现抽象原型类的 clone() 方法，它是可被复制的对象。
 * @author lh2
 * @date 2020年4月24日 上午10:35:07
 */
public class ConcretePrototype extends Prototype
{
	public void show(Integer index)
	{
		System.out.println("原型模式实现类" + index);
	}
}