package com.ctgu.state;

/**
 * @ClassName: Dead
 * @Description:具体状态类：死亡状态
 * @author lh2
 * @date 2020年6月12日 下午5:17:09
 */
public class Dead extends ThreadState
{
	public Dead()
	{
		stateName = "死亡状态";
		System.out.println("当前线程处于：死亡状态.");
	}
}