package com.ctgu.command;

public class CommandOn implements Command
{
	private TV myTV;

	public CommandOn(TV tv)
	{
		myTV = tv;
	}

	public void execute()
	{
		myTV.turnOn();
	}
}
// 关机命令ConcreteCommand
