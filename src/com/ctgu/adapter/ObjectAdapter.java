package com.ctgu.adapter;

/**
 * @ClassName: ObjectAdapter
 * @Description: 对象适配器
 *               <p>
 *               另外一种适配器模式是对象适配器，它不是使用多继承或继承再实现的方式，而是使用直接关联，或者称为委托的方式<br>
 *               需要修改的只不过就是 Adapter 类的内部结构，即 Adapter 自身必须先拥有一个被适配类的对象，<br>
 *               再把具体的特殊功能委托给这个对象来实现。使用对象适配器模式，<br>
 *               可以使得 Adapter 类（适配类）根据传入的 Adaptee 对象达到适配多个不同被适配类的功能，<br>
 *               当然，此时我们可以为多个被适配类提取出一个接口或抽象类。这样看起来的话，似乎对象适配器模式更加灵活一点。<br>
 *               适配器类，直接关联被适配类，同时实现标准接口 <br>
 * @author lh2
 * @date 2020年6月12日 下午4:39:35
 */
public class ObjectAdapter implements Target
{
	// 直接关联被适配类
	private Adaptee adaptee;

	// 可以通过构造函数传入具体需要适配的被适配类对象
	public ObjectAdapter(Adaptee adaptee)
	{
		this.adaptee = adaptee;
	}

	public void request()
	{
		// 这里是使用委托的方式完成特殊功能
		this.adaptee.specificRequest();
	}

	public static void main(String[] args)
	{
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// 使用特殊功能类，即适配类，
		// 需要先创建一个被适配类的对象作为参数
		Target adapter = new ObjectAdapter(new Adaptee());
		adapter.request();
	}

}
