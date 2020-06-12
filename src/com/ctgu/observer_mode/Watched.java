package com.ctgu.observer_mode;

/**
 * @ClassName: Watched
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:10:41
 */
public interface Watched
{
	void addWatcher(Watcher watcher);

	void removeWatcher(Watcher watcher);

	void notifyWatchers();
}