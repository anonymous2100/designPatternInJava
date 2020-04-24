package com.ctgu.command;

public class CommandOff implements Command
{
	private TV myTV;

	public CommandOff(TV tv)
	{
		myTV = tv;
	}

	public void execute()
	{
		myTV.turnOff();
	}
}
// 频道切换命令ConcreteCommand
