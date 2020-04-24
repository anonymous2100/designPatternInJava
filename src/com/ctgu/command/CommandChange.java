package com.ctgu.command;

public class CommandChange implements Command
{
	private TV myTV;

	private int channel;

	public CommandChange(TV tv, int channel)
	{
		myTV = tv;
		this.channel = channel;
	}

	public void execute()
	{
		myTV.changeChannel(channel);
	}
}
// 可以看作是遥控器Invoker
