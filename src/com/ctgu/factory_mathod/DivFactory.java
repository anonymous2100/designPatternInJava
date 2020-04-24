package com.ctgu.factory_mathod;

/**
 * @ClassName: DivFactory
 * @Description: 具体工厂类：生产“除法”操作的工厂
 * @author lh2
 * @date 2020年4月24日 上午11:40:08
 */
public class DivFactory implements IFactory
{
	@Override
	public Operation createOperation()
	{
		return new OperationDiv();
	}

}
