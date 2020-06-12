package com.ctgu.strategy;

/**
 * @ClassName: ConcreteStrategyB
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:26:30
 */
public class ConcreteStrategyB implements Strategy
{

	@Override
	public void algorithmInterface()
	{
		System.out.println("策略B的具体算法实现");
	}

}
