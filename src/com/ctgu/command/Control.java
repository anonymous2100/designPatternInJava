package com.ctgu.command;

/**
 * @ClassName: Control
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:53:14
 */
public class Control
{
	private Command onCommand, offCommand, changeChannel;

	public Control(Command on, Command off, Command channel)
	{
		onCommand = on;
		offCommand = off;
		changeChannel = channel;
	}

	public void turnOn()
	{
		onCommand.execute();
	}

	public void turnOff()
	{
		offCommand.execute();
	}

	public void changeChannel()
	{
		changeChannel.execute();
	}
}
// 测试类Client
