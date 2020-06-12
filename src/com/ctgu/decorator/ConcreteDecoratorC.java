package com.ctgu.decorator;

/**
 * @ClassName: ConcreteDecoratorC
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:57:57
 */
public class ConcreteDecoratorC extends Decorator
{
	@Override
	public void operation()
	{
		super.operation();
		System.out.println("C没有特殊行为  具体装饰对象C的操作");
	}

}
