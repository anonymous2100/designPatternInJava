package com.ctgu.adapter;

/**
 * @ClassName: ClassAdapter
 * @Description: 适配器模式
 *               <p>
 *               上面这种实现的适配器称为类适配器，因为 Adapter 类既继承了 Adaptee （被适配类）， <br>
 *               也实现了 Target 接口（因为 Java 不支持多继承，所以这样来实现）， <br>
 *               在 Client类中我们可以根据需要选择并创建任一种符合需求的子类，来实现具体功能。 <br>
 *               适配器类，继承了被适配类，同时实现标准接口 <br>
 * @author lh2
 * @date 2020年6月12日 下午4:37:46
 */
public class ClassAdapter extends Adaptee implements Target
{
	public void request()
	{
		super.specificRequest();
	}

	public static void main(String[] args)
	{
		// 使用普通功能类
		Target concreteTarget = new ConcreteTarget();
		concreteTarget.request();

		// 使用特殊功能类，即适配类
		Target adapter = new ClassAdapter();
		adapter.request();
	}

}
