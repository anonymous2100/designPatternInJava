package com.ctgu.mediator;

/**
 * @ClassName: MediatorPattern
 * @Description: 中介者（Mediator）模式： 定义一个中介对象来封装一系列对象之间的交互，使原有对象之间的耦合松散，
 *               <p>
 *               且可以独立地改变它们之间的交互。中介者模式又叫调停模式，它是迪米特法则的典型应用。<br>
 *               中介者模式是一种对象行为型模式，<br>
 *               优点：<br>
 *               降低了对象之间的耦合性，使得对象易于独立地被复用。<br>
 *               将对象间的一对多关联转变为一对一的关联，提高系统的灵活性，使得系统易于维护和扩展。<br>
 *               缺点：<br>
 *               当同事类太多时，中介者的职责将很大，它会变得复杂而庞大，以至于系统难以维护。<br>
 *               模式的结构与实现<br>
 *               中介者模式实现的关键是找出“中介者”，下面对它的结构和实现进行分析。<br>
 *               1. 模式的结构<br>
 *               中介者模式包含以下主要角色。<br>
 *               抽象中介者（Mediator）角色：<br>
 *               它是中介者的接口，提供了同事对象注册与转发同事对象信息的抽象方法。<br>
 *               具体中介者（ConcreteMediator）角色：<br>
 *               实现中介者接口，定义一个 List 来管理同事对象，协调各个同事角色之间的交互关系，因此它依赖于同事角色。<br>
 *               抽象同事类（Colleague）角色：<br>
 *               定义同事类的接口，保存中介者对象，提供同事对象交互的抽象方法，实现所有相互影响的同事类的公共功能。<br>
 *               具体同事类（Concrete Colleague）角色：<br>
 *               是抽象同事类的实现者，当需要与其他同事对象交互时，由中介者对象负责后续的交互。<br>
 * @author lh2
 * @date 2020年6月12日 下午5:09:15
 */
public class MediatorPattern
{
	public static void main(String[] args)
	{
		Mediator md = new ConcreteMediator();
		Colleague c1, c2;
		c1 = new ConcreteColleague1();
		c2 = new ConcreteColleague2();
		md.register(c1);
		md.register(c2);
		c1.send();
		System.out.println("-------------");
		c2.send();
	}
}
