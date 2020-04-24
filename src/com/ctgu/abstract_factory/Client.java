package com.ctgu.abstract_factory;

/**
 * @ClassName: Client
 * @Description: 抽象工厂模式（AbstractFactory） <br>
 *               提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类 <br>
 *               抽象工厂模式的主要角色如下。<br>
 *               1、抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。<br>
 *               2、具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。<br>
 *               3、抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。<br>
 *               4、具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。<br>
 *               优点：<br>
 *               1、易于交换产品系列，例如Ifactory factory = new AccessFactory()在一个应用中只需要在初始化的时候出现一次，<br>
 *               这就使得改变一个应用的具体工厂变得非常容易，它只需要改变具体工厂即可使用不同的产品配置。<br>
 *               2、它让具体的创建实例过程与客户端分离，客户端是通过它们的抽象接口操纵实例，产品的具体类名也被具体工厂的实现分离 ，<br>
 *               不会出现在客户代码中。所有在用简单工厂的地方，都可以考虑用反射技术来去除switch或if，解除分支判断带来的耦合 <br>
 *               缺点：<br>
 *               如果要添加一个产品类，就得增加很多代码<br>
 * @author lh2
 * @date 2020年4月24日 上午11:52:19
 */
public class Client
{
	public static void main(String[] args)
	{
		// 大众系列配件
		ConcreteFactoryA factoryA = new ConcreteFactoryA();
		factoryA.createEngine();
		factoryA.createAirCondition();

		// 宝马系列配件
		ConcreteFactoryB factoryB = new ConcreteFactoryB();
		factoryB.createEngine();
		factoryB.createAirCondition();

	}

}
