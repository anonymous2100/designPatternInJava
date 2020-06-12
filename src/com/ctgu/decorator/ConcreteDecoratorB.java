package com.ctgu.decorator;

/**
 * @ClassName: ConcreteDecoratorB
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:57:29
 */
public class ConcreteDecoratorB extends Decorator
{
	@Override
	public void operation()
	{
		super.operation();
		addBehavior();
		System.out.println("B中的现在行为  具体装饰对象B的操作");
	}

	private void addBehavior()
	{
		System.out.println("B中的新增行为");
	}

}
