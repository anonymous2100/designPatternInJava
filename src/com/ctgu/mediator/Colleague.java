package com.ctgu.mediator;

/**
 * @ClassName: Colleague
 * @Description:抽象同事类
 * @author lh2
 * @date 2020年6月12日 下午5:06:33
 */
public abstract class Colleague
{
	protected Mediator mediator;

	public void setMedium(Mediator mediator)
	{
		this.mediator = mediator;
	}

	public abstract void receive();

	public abstract void send();
}