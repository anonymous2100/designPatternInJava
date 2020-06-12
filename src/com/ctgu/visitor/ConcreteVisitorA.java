package com.ctgu.visitor;

/**
 * @ClassName: ConcreteVisitorA
 * @Description: 具体访问者A类
 * @author lh2
 * @date 2020年6月12日 下午5:28:50
 */
public class ConcreteVisitorA implements Visitor
{
	public void visit(ConcreteElementA element)
	{
		System.out.println("具体访问者A访问-->" + element.operationA());
	}

	public void visit(ConcreteElementB element)
	{
		System.out.println("具体访问者A访问-->" + element.operationB());
	}
}
