package com.ctgu.strategy;

/**
 * @ClassName: ConcreteStrategyA
 * @Description: 具体策略类，封装了具体的算法或行为，继承于Strategy
 * @author lh2
 * @date 2020年6月12日 下午5:26:17
 */
public class ConcreteStrategyA implements Strategy
{

	@Override
	public void algorithmInterface()
	{
		System.out.println("策略A的具体算法实现");
	}

}
