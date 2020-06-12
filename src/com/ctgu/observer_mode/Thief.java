package com.ctgu.observer_mode;

/**
 * @ClassName: Thief
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:10:30
 */
public class Thief implements Watcher
{
	@Override
	public void update()
	{
		System.out.println("运输车有行动，强盗准备动手");
	}
}
