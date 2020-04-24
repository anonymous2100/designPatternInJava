package com.ctgu.factory_mathod;

/**
 * @ClassName: Operation
 * @Description: 抽象产品类：定义加减乘除运算操作的抽象类
 * @author lh2
 * @date 2020年4月24日 上午11:41:16
 */
public abstract class Operation
{
	public double numberA;
	public double numberB;

	public abstract double result();

}
