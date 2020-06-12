package com.ctgu.simple_factory_method;

/**
 * @ClassName: OperationAdd
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:16:35
 */
public class OperationAdd extends Operation
{

	@Override
	public double result()
	{
		return numberA + numberB;
	}

}
