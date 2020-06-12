package com.ctgu.observer_mode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Transporter
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:10:36
 */
public class Transporter implements Watched
{
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher)
	{
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher)
	{
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers()
	{
		for (Watcher watcher : list)
		{
			watcher.update();
		}
	}

}
