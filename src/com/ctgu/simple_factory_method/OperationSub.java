package com.ctgu.simple_factory_method;

/**
 * @ClassName: OperationSub
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:16:44
 */
public class OperationSub extends Operation
{

	@Override
	public double result()
	{
		return numberA - numberB;
	}

}
