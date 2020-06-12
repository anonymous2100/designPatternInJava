package com.ctgu.state;

/**
 * @ClassName: New
 * @Description: 具体状态类：新建状态
 * @author lh2
 * @date 2020年6月12日 下午5:17:17
 */
public class New extends ThreadState
{
	public New()
	{
		stateName = "新建状态";
		System.out.println("当前线程处于：新建状态.");
	}

	public void start(ThreadContext hj)
	{
		System.out.print("调用start()方法-->");
		if (stateName.equals("新建状态"))
		{
			hj.setState(new Runnable());
		}
		else
		{
			System.out.println("当前线程不是新建状态，不能调用start()方法.");
		}
	}
}
