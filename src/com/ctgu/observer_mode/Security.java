package com.ctgu.observer_mode;

/**
 * @ClassName: Security
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:10:18
 */
public class Security implements Watcher
{
	@Override
	public void update()
	{
		System.out.println("运输车有行动，保安贴身保护");
	}
}