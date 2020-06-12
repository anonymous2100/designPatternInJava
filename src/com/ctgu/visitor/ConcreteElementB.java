package com.ctgu.visitor;

/**
 * @ClassName: ConcreteElementB
 * @Description: 具体元素B类
 * @author lh2
 * @date 2020年6月12日 下午5:28:40
 */
public class ConcreteElementB implements Element
{
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}

	public String operationB()
	{
		return "具体元素B的操作。";
	}
}