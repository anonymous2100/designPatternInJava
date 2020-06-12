package com.ctgu.visitor;

/**
 * @ClassName: ConcreteVisitorB
 * @Description: 具体访问者B类
 * @author lh2
 * @date 2020年6月12日 下午5:28:57
 */
public class ConcreteVisitorB implements Visitor
{
	public void visit(ConcreteElementA element)
	{
		System.out.println("具体访问者B访问-->" + element.operationA());
	}

	public void visit(ConcreteElementB element)
	{
		System.out.println("具体访问者B访问-->" + element.operationB());
	}
}
