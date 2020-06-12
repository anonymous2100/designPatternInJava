package com.ctgu.decorator;

/**
 * @ClassName: ConcreteComponent
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:57:19
 */
public class ConcreteComponent extends Component
{
	@Override
	public void operation()
	{
		System.out.println("具体对象的操作");
	}

}
