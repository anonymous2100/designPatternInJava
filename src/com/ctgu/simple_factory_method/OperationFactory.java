package com.ctgu.simple_factory_method;

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
