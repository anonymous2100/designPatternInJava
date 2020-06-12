package com.ctgu.state;

/**
 * @ClassName: Runnable
 * @Description: 具体状态类：就绪状态
 * @author lh2
 * @date 2020年6月12日 下午5:17:26
 */
public class Runnable extends ThreadState
{
	public Runnable()
	{
		stateName = "就绪状态";
		System.out.println("当前线程处于：就绪状态.");
	}

	public void getCPU(ThreadContext hj)
	{
		System.out.print("获得CPU时间-->");
		if (stateName.equals("就绪状态"))
		{
			hj.setState(new Running());
		}
		else
		{
			System.out.println("当前线程不是就绪状态，不能获取CPU.");
		}
	}
}