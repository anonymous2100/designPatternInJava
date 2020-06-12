package com.ctgu.decorator;

/**
 * @ClassName: ConcreteDecoratorA
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:57:24
 */
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
