package com.ctgu.command;

/**
 * @ClassName: Client
 * @Description: 命令（Command）模式： <br>
 *               将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。这样两者之间通过命令对象进行沟通， <br>
 *               这样方便将命令对象进行储存、传递、调用、增加与管理。 <br>
 *               优点： <br>
 *               降低系统的耦合度。命令模式能将调用操作的对象与实现该操作的对象解耦。 <br>
 *               增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，它满足“开闭原则”，对扩展比较灵活。 <br>
 *               可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令。 <br>
 *               方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。 <br>
 *               <br>
 *               缺点： <br>
 *               可能产生大量具体命令类。因为计对每一个具体操作都需要设计一个具体命令类，这将增加系统的复杂性。 <br>
 * @author lh2
 * @date 2020年6月12日 下午4:54:24
 */
public class Client
{
	public static void main(String[] args)
	{
		// 命令接收者Receiver
		TV myTV = new TV();
		// 开机命令ConcreteCommond
		CommandOn on = new CommandOn(myTV);
		// 关机命令ConcreteCommond
		CommandOff off = new CommandOff(myTV);
		// 频道切换命令ConcreteCommond
		CommandChange channel = new CommandChange(myTV, 2);
		// 命令控制对象Invoker
		Control control = new Control(on, off, channel);

		// 开机
		control.turnOn();
		// 切换频道
		control.changeChannel();
		// 关机
		control.turnOff();
	}
}
