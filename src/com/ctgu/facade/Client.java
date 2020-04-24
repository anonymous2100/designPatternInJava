package com.ctgu.facade;

// 外观模式
public class Client
{
	public static void main(String[] args)
	{
		Facade facade = new Facade();
		facade.test();
	}

}
