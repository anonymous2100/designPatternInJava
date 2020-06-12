package com.ctgu.visitor;

/**
 * @ClassName: VisitorPattern
 * @Description:访问者（Visitor）模式： <br>
 *                              将作用于某种数据结构中的各元素的操作分离出来封装成独立的类，<br>
 *                              使其在不改变数据结构的前提下可以添加作用于这些元素的新的操作，<br>
 *                              为数据结构中的每个元素提供多种访问方式。<br>
 *                              它将对数据的操作与数据结构进行分离，是行为类模式中最复杂的一种模式。<br>
 * @author lh2
 * @date 2020年6月12日 下午5:29:35
 */
public class VisitorPattern
{
	public static void main(String[] args)
	{
		ObjectStructure os = new ObjectStructure();
		os.add(new ConcreteElementA());
		os.add(new ConcreteElementB());
		Visitor visitor = new ConcreteVisitorA();
		os.accept(visitor);
		System.out.println("------------------------");
		visitor = new ConcreteVisitorB();
		os.accept(visitor);
	}
}
