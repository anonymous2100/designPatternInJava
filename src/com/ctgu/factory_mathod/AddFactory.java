package com.ctgu.factory_mathod;

/**
 * @ClassName: AddFactory
 * @Description: 具体工厂类：生产“加法”操作的工厂
 * @author lh2
 * @date 2020年4月24日 上午11:39:26
 */
public class AddFactory implements IFactory
{
	@Override
	public Operation createOperation()
	{
		return new OperationAdd();
	}

}
