package com.ctgu.prototype;

/**
 * @ClassName: Client
 * @Description:访问类：使用具体原型类中的 clone() 方法来复制新的对象。
 * @author lh2
 * @date 2020年4月24日 上午10:35:47
 */
public class Client
{
	public static void main(String[] args)
	{
		ConcretePrototype cp = new ConcretePrototype();
		for (int i = 0; i < 10; i++)
		{
			ConcretePrototype clonecp = (ConcretePrototype) cp.clone();
			clonecp.show(i);
			System.out.println(clonecp + "\n");
		}

	}
}
