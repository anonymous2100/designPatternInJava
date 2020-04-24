package com.ctgu.abstract_factory;

/**
 * @ClassName: AbstractFactory
 * @Description: 抽象工厂类：定义生产产品A引擎和产品B空调的操作
 * @author lh2
 * @date 2020年4月24日 上午11:45:57
 */
public interface AbstractFactory
{
	Engine createEngine();

	AirCondition createAirCondition();
}
