package com.ctgu.simple_factory_method;

/**
 * @ClassName: Calculator
 * @Description: 简单工厂模式（Simple Factory）：<br>
 *               不符合开放-封闭原则（当我们需要增加一种计算时，例如开平方。<br>
 *               这个时候我们需要先定义一个类继承Operation类，其中实现平方的代码。除此之外我们还要修改OperationFactory类的代码，<br>
 *               增加一个case。所以显然违反了）<br>
 *               简单工厂模式只有一个具体的工厂类<br>
 *               简单工厂模式：一个上帝类，能够生产A车，若有一种B车需要生产，则需要更改上帝类工厂代码<br>
 * @author lh2
 * @date 2020年6月12日 下午5:15:53
 */
public class Calculator
{
	public static void main(String[] args)
	{
		Operation operation;
		char operator = '+';
		operation = OperationFactory.createOperation(operator);
		operation.numberA = 1.2;
		operation.numberB = 2.3;
		System.out.println(operation.result());

	}

}
