package com.ctgu.command;

/**
 * @ClassName: TV
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:53:41
 */
public class TV
{
	public int currentChannel = 0;

	public void turnOn()
	{
		System.out.println("The televisino is on.");
	}

	public void turnOff()
	{
		System.out.println("The television is off.");
	}

	public void changeChannel(int channel)
	{
		this.currentChannel = channel;
		System.out.println("Now TV channel is " + channel);
	}
}
// 开机命令ConcreteCommand
