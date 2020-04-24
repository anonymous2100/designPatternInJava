package com.ctgu.strategy;

/**
 * Context上下文，用一个ContextStrategy来配置，维护一个对Stragegy对象的引用
 * 
 * @author Administrator
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
