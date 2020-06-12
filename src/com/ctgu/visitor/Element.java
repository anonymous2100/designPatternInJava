package com.ctgu.visitor;

/**
 * @ClassName: Element
 * @Description: 抽象元素类
 * @author lh2
 * @date 2020年6月12日 下午5:29:04
 */
public interface Element
{
	void accept(Visitor visitor);
}