package com.ctgu.iterative_subpattern;

/**
 * @ClassName: Iterator
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:05:52
 */
public interface Iterator
{
	/**
	 * 迭代方法：移动到第一个元素
	 */
	public void first();

	/**
	 * 迭代方法：移动到下一个元素
	 */
	public void next();

	/**
	 * 迭代方法：是否为最后一个元素
	 */
	public boolean isDone();

	/**
	 * 迭代方法：返还当前元素
	 */
	public Object currentItem();
}
