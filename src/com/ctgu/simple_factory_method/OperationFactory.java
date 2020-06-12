package com.ctgu.simple_factory_method;

/**
 * @ClassName: OperationFactory
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:16:40
 */
public class OperationFactory
{
	public static Operation createOperation(char operator)
	{
		Operation operation = null;
		switch (operator)
		{
			case '+':
				operation = new OperationAdd();
				break;
			case '-':
				operation = new OperationSub();
				break;
		}
		return operation;
	}

}
