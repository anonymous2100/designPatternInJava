package com.ctgu.factory_mathod;

/**
 * @ClassName: OperationDiv
 * @Description: 具体产品类：具体的除法操作
 * @author lh2
 * @date 2020年4月24日 上午11:43:16
 */
public class OperationDiv extends Operation
{
	@Override
	public double result()
	{
		return numberA / numberB;
	}

}
