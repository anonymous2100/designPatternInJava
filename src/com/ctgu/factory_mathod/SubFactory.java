package com.ctgu.factory_mathod;

/**
 * @ClassName: SubFactory
 * @Description: 具体工厂类：生产“减法”操作的工厂
 * @author lh2
 * @date 2020年4月24日 上午11:42:14
 */
public class SubFactory implements IFactory
{
	@Override
	public Operation createOperation()
	{
		return new OperationSub();
	}

}
