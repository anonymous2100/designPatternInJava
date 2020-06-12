package com.ctgu.mediator;

/**
 * @ClassName: Mediator
 * @Description: 抽象中介者
 * @author lh2
 * @date 2020年6月12日 下午5:07:10
 */
public abstract class Mediator
{
	public abstract void register(Colleague colleague);

	public abstract void relay(Colleague cl); // 转发
}