package com.ctgu.mediator;

/**
 * @ClassName: ConcreteColleague2
 * @Description: 具体同事类
 * @author lh2
 * @date 2020年6月12日 下午5:06:53
 */
public class ConcreteColleague2 extends Colleague
{
	public void receive()
	{
		System.out.println("具体同事类2收到请求。");
	}

	public void send()
	{
		System.out.println("具体同事类2发出请求。");
		mediator.relay(this); // 请中介者转发
	}
}