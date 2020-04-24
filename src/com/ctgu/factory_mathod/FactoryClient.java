package com.ctgu.factory_mathod;

/**
 * @ClassName: FactoryClient
 * @Description: 工厂方法模式：工厂方法模式是简单工厂的进一步深化。<br>
 *               工厂方法模式由抽象工厂、具体工厂、抽象产品和具体产品等4个要素构成。<br>
 *               工厂方法模式的主要角色如下。<br>
 *               1、抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。<br>
 *               2、具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。<br>
 *               3、抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。<br>
 *               4、具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。<br>
 *               在工厂方法模式中，我们不再提供一个统一的工厂类来创建所有的对象，而是针对不同的对象提供不同的工厂。<br>
 *               也就是说每个对象都有一个与之对应的工厂。<br>
 *               定义：<br>
 *               （1）定义一个用于创建对象的接口，让子类决定将哪一个类实例化。工厂方法模式让一个类的实例化延迟到其子类。<br>
 *               （2）这次我们先用实例详细解释一下这个定义，最后在总结它的使用场景。<br>
 * @author lh2
 * @date 2020年4月24日 上午10:59:16
 */
public class FactoryClient
{
	public static void main(String[] args)
	{
		Operation operation;

		IFactory factory = new DivFactory();
		operation = factory.createOperation();
		operation.numberA = 3.4;
		operation.numberB = 4.5;
		System.out.println(operation.result());

		// 工厂方法把简单工厂的内部逻辑判断转移到了客户端代码来进行
		// 缺点：每加一个产品，需要额外加一个产品工厂的类，增加了额外的开销。
		factory = new AddFactory();
		operation = factory.createOperation();
		operation.numberA = 3.4;
		operation.numberB = 4.5;
		System.out.println(operation.result());

	}

}
