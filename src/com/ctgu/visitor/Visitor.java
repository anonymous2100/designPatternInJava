package com.ctgu.visitor;

/**
 * @ClassName: Visitor
 * @Description: 抽象访问者
 * @author lh2
 * @date 2020年6月12日 下午5:29:25
 */
public interface Visitor
{
	void visit(ConcreteElementA element);

	void visit(ConcreteElementB element);
}
