package com.ctgu.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: ConcreteMediator
 * @Description:具体中介者
 * @author lh2
 * @date 2020年6月12日 下午5:07:04
 */
public class ConcreteMediator extends Mediator
{
	private List<Colleague> colleagues = new ArrayList<Colleague>();

	public void register(Colleague colleague)
	{
		if (!colleagues.contains(colleague))
		{
			colleagues.add(colleague);
			colleague.setMedium(this);
		}
	}

	public void relay(Colleague cl)
	{
		for (Colleague ob : colleagues)
		{
			if (!ob.equals(cl))
			{
				((Colleague) ob).receive();
			}
		}
	}
}