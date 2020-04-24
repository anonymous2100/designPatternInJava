package com.ctgu.decorator;

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
