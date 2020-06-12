package com.ctgu.decorator;

/**
 * @ClassName: DecoratorClient
 * @Description: 装饰者模式：<br>
 *               指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能），属于对象结构型模式。<br>
 * @author lh2
 * @date 2020年6月12日 下午4:58:08
 */
public class DecoratorClient
{
	public static void main(String[] args)
	{
		ConcreteComponent concreteComponent = new ConcreteComponent();

		ConcreteDecoratorA concreteDecoratorA = new ConcreteDecoratorA();
		concreteDecoratorA.setComponent(concreteComponent);

		ConcreteDecoratorC concreteDecoratorC = new ConcreteDecoratorC();
		concreteDecoratorC.setComponent(concreteDecoratorA);
		concreteDecoratorC.operation();

	}

}
