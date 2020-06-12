package com.ctgu.adapter;

/**
 * @ClassName: ConcreteTarget
 * @Description:具体目标类，只提供普通功能
 * @author lh2
 * @date 2020年6月12日 下午4:39:10
 */
public class ConcreteTarget implements Target
{
	public void request()
	{
		System.out.println("普通类 具有 普通功能...");
	}
}
