package com.ctgu.observer_mode;

/**
 * @ClassName: Test
 * @Description:观察者（Observer）模式：<br>
 *                                   指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。<br>
 *                                   <p>
 *                                   这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式。<br>
 * @author lh2
 * @date 2020年6月12日 下午5:10:23
 */
public class Test
{
	public static void main(String[] args)
	{
		Transporter transporter = new Transporter();

		Police police = new Police();
		Security security = new Security();
		Thief thief = new Thief();

		transporter.addWatcher(police);
		transporter.addWatcher(security);
		transporter.addWatcher(thief);

		transporter.notifyWatchers();
	}

}
