package com.ctgu.flyweight;

/**
 * @ClassName: FlyweightPattern
 * @Description: 享元（Flyweight）模式：<br>
 *               运用共享技术来有効地支持大量细粒度对象的复用。<br>
 *               它通过共享已经存在的又橡来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。<br>
 * @author lh2
 * @date 2020年6月12日 下午5:02:07
 */
public class FlyweightPattern
{
	FlyweightFactory factory = new FlyweightFactory();
	Flyweight fly1;
	Flyweight fly2;
	Flyweight fly3;
	Flyweight fly4;
	Flyweight fly5;
	Flyweight fly6;

	public FlyweightPattern()
	{
		fly1 = factory.getFlyWeight("Facebook");
		fly2 = factory.getFlyWeight("Twitter");
		fly3 = factory.getFlyWeight("Quera");
		fly4 = factory.getFlyWeight("Facebook");
		fly5 = factory.getFlyWeight("Facebook");
		fly6 = factory.getFlyWeight("Facebook");
	}

	public void showFlyweight()
	{
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int objSize = factory.getFlyweightSize();
		System.out.println("objSize = " + objSize);
	}

	public static void main(String[] args)
	{
		System.out.println("The FlyWeight Pattern!");
		FlyweightPattern fp = new FlyweightPattern();
		fp.showFlyweight();
	}
}
