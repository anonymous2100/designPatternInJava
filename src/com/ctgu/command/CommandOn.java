package com.ctgu.command;

/**
 * @ClassName: CommandOn
 * @Description: 关机命令ConcreteCommand
 * @author lh2
 * @date 2020年6月12日 下午4:52:26
 */
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
