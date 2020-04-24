package com.ctgu.factory_mathod;

/**
 * @ClassName: OperationSub
 * @Description: 具体产品类：具体的减法操作
 * @author lh2
 * @date 2020年4月24日 上午11:43:31
 */
public class OperationSub extends Operation
{
	@Override
	public double result()
	{
		return numberA - numberB;
	}

}
