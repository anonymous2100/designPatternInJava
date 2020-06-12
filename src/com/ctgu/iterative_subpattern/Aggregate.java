package com.ctgu.iterative_subpattern;

/**
 * @ClassName: Aggregate
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:05:27
 */
public abstract class Aggregate
{
	/**
	 * 工厂方法，创建相应迭代子对象的接口
	 */
	public abstract Iterator createIterator();
}
