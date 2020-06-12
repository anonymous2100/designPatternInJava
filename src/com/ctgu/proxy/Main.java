package com.ctgu.proxy;

/**
 * @ClassName: Main
 * @Description:代理模式：<br>
 *                        由于某些原因需要给某对象提供一个代理以控制对该对象的访问。<br>
 *                        这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介。<br>
 * @author lh2
 * @date 2020年6月12日 下午5:12:05
 */
public class Main
{
	public static void main(String[] args)
	{
		People people1 = new People();
		people1.setCash(60000);
		people1.setUsername("关羽");

		People people2 = new People();
		people2.setCash(40000);
		people2.setUsername("张飞");

		People people3 = new People();
		people3.setCash(0);
		people3.setUsername("刘备");
		people3.setVip("vip");

		ProxyClass proxyBuy = new ProxyClass();
		proxyBuy.setPeople(people1);
		proxyBuy.buyMycar();

		proxyBuy.setPeople(people2);
		proxyBuy.buyMycar();

		proxyBuy.setPeople(people3);
		proxyBuy.buyMycar();
	}
}
