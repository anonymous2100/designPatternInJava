package com.ctgu.abstract_factory;

/**
 * @ClassName: ConcreteFactoryB
 * @Description:具体工厂类B，生产规格为EngineB的汽车引擎和规格为AirConditionB的空调产品（宝马系列）
 * @author lh2
 * @date 2020年4月24日 上午11:48:01
 */
public class ConcreteFactoryB implements AbstractFactory
{
	@Override
	public Engine createEngine()
	{
		return new EngineB();
	}

	@Override
	public AirCondition createAirCondition()
	{
		return new AirConditionB();
	}
}
