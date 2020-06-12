package com.ctgu.strategy;

/**
 * @ClassName: Strategy
 * @Description: 策略模式（Strategy） <br>
 *               多个算法可实现类似功能，若将所有方法写在一个Utils里面会导致难以维护，代码复杂。<br>
 *               所以策略模式考虑如何让算法和对象分开来，使得算法可以独立于使用它的客户而变化。<br>
 *               具体的方案是把一个类中经常改变或者将来可能改变的部分提取出来，作为一个接口，<br>
 *               然后在类中包含这个对象的实例，这样类的实例在运行时就可以随意调用实现了这个接口的类的行为。<br>
 *               策略模式就是用来封装算法的，但在实践中，我们发现可以用它来封装几乎任何类型的规则，<br>
 *               只要在分析过程中听到需要在不同时间应用不同的业务规则，就可以考虑使用策略模式处理这种变化的可能性。<br>
 *               优点<br>
 *               1、可以动态的改变对象的行为<br>
 *               缺点<br>
 *               1、客户端必须知道所有的策略类，并自行决定使用哪一个策略类<br>
 *               2、策略模式将造成产生很多策略类<br>
 *               <br>
 *               策略类，定义所有支持的算法的公共接口
 * @author lh2
 * @date 2020年6月12日 下午5:26:57
 */
public class Main
{

	public static void main(String[] args)
	{
		Context context;
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();

		context = new Context(new ConcreteStrategyB());
		context.contextInterface();

	}
}
