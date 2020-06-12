package com.ctgu.visitor;

/**
 * @ClassName: ConcreteElementA
 * @Description:具体元素A类
 * @author lh2
 * @date 2020年6月12日 下午5:28:32
 */
public class ConcreteElementA implements Element
{
	public void accept(Visitor visitor)
	{
		visitor.visit(this);
	}

	public String operationA()
	{
		return "具体元素A的操作。";
	}
}