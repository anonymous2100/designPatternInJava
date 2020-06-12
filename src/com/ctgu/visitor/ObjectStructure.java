package com.ctgu.visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ObjectStructure
 * @Description: 对象结构角色
 * @author lh2
 * @date 2020年6月12日 下午5:29:16
 */
public class ObjectStructure
{
	private List<Element> list = new ArrayList<Element>();

	public void accept(Visitor visitor)
	{
		Iterator<Element> i = list.iterator();
		while (i.hasNext())
		{
			((Element) i.next()).accept(visitor);
		}
	}

	public void add(Element element)
	{
		list.add(element);
	}

	public void remove(Element element)
	{
		list.remove(element);
	}
}