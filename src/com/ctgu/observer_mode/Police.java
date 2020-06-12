package com.ctgu.observer_mode;

/**
 * @ClassName: Police
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:10:13
 */
public class Police implements Watcher
{
	@Override
	public void update()
	{
		System.out.println("运输车有行动，警察护航");
	}
}
