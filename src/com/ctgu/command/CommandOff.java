package com.ctgu.command;

/**
 * @ClassName: CommandOff
 * @Description:频道切换命令ConcreteCommand
 * @author lh2
 * @date 2020年6月12日 下午4:53:58
 */
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
