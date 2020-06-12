package com.ctgu.command;

/**
 * @ClassName: CommandChange
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:54:08
 */
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
