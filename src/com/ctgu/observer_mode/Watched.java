package com.ctgu.observer_mode;

public interface Watched
{
	void addWatcher(Watcher watcher);

	void removeWatcher(Watcher watcher);

	void notifyWatchers();
}