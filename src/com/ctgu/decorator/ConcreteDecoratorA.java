package com.ctgu.decorator;

public class ConcreteDecoratorA extends Decorator
{
	@Override
	public void operation()
	{
		// 首先运行原Component的operation()
		// 再执行本类的功能，相当于对原Component进行了装饰
		super.operation();
		System.out.println("具体装饰对象A的操作");

	}

}
