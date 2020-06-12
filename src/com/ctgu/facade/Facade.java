package com.ctgu.facade;

/**
 * @ClassName: Facade
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:00:19
 */
public class Facade
{
	// 示意方法，满足客户端需要的功能
	public void test()
	{
		ModuleA a = new ModuleA();
		a.testA();
		ModuleB b = new ModuleB();
		b.testB();
		ModuleC c = new ModuleC();
		c.testC();
	}

}
