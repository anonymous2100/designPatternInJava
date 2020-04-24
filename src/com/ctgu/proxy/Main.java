package com.ctgu.proxy;

public class Main
{
	public static void main(String[] args)
	{
		People people1 = new People();
		people1.setCash(60000);
		people1.setUsername("jeck");

		People people2 = new People();
		people2.setCash(40000);
		people2.setUsername("rose");

		People people3 = new People();
		people3.setCash(0);
		people3.setUsername("tom");
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
