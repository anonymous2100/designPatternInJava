package com.ctgu.decorator;

/**
 * @ClassName: Decorator
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:58:03
 */
public class Decorator extends Component
{
	protected Component component;

	public Component getComponent()
	{
		return component;
	}

	public void setComponent(Component component)
	{
		this.component = component;
	}

	@Override
	public void operation()
	{
		if (component != null)
		{
			component.operation();
		}
	}

}
