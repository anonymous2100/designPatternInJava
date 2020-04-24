package com.ctgu.command;

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
