package com.ctgu.strategy;

/**
 * @ClassName: Context
 * @Description: Context上下文，用一个ContextStrategy来配置，维护一个对Stragegy对象的引用
 * @author lh2
 * @date 2020年6月12日 下午5:26:38
 */
public class Context
{
	Strategy strategy;

	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}

	public void contextInterface()
	{
		strategy.algorithmInterface();
	}

}
