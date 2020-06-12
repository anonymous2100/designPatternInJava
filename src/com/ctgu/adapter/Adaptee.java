package com.ctgu.adapter;

/**
 * @ClassName: Adaptee
 * @Description: 已存在的、具有特殊功能、但不符合我们既有的标准接口的类
 * @author lh2
 * @date 2020年6月12日 下午4:37:35
 */
public class Adaptee
{
	public void specificRequest()
	{
		System.out.println("被适配类具有 特殊功能...");
	}
}
