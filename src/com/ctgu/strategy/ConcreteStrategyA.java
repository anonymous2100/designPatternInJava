package com.ctgu.strategy;

/**
 * 具体策略类，封装了具体的算法或行为，继承于Strategy
 * @author Administrator
 */
public class ConcreteStrategyA implements Strategy
{

	@Override
	public void algorithmInterface()
	{
		System.out.println("策略A的具体算法实现");
	}

}
