package com.ctgu.factory_mathod;

/**
 * @ClassName: OperationAdd
 * @Description: 具体产品类：具体的加法操作
 * @author lh2
 * @date 2020年4月24日 上午11:41:48
 */
public class OperationAdd extends Operation
{
	@Override
	public double result()
	{
		return numberA + numberB;
	}

}
