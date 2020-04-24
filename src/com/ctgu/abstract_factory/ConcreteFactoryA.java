package com.ctgu.abstract_factory;

/**
 * @ClassName: ConcreteFactoryA
 * @Description: 具体工厂类A，生产规格为EngineA的汽车引擎和规格为AirConditionA的空调产品（大众系列）
 * @author lh2
 * @date 2020年4月24日 上午11:46:57
 */
public class ConcreteFactoryA implements AbstractFactory
{

	@Override
	public Engine createEngine()
	{
		return new EngineA();
	}

	@Override
	public AirCondition createAirCondition()
	{
		return new AirConditionA();
	}

}
