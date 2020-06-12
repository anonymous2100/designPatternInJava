package com.ctgu.builder;

/**
 * @ClassName: Test
 * @Description: 建造者（Builder）模式：<br>
 *               建造者（Builder）模式的定义：指将一个复杂对象的构造与它的表示分离，使同样的构建过程可以创建不同的表示，<br>
 *               这样的设计模式被称为建造者模式。它是将一个复杂的对象分解为多个简单的对象，然后一步一步构建而成。<br>
 *               它将变与不变相分离，即产品的组成部分是不变的，但每一部分是可以灵活选择的。<br>
 *               该模式的主要优点如下：<br>
 *               各个具体的建造者相互独立，有利于系统的扩展。<br>
 *               客户端不必知道产品内部组成的细节，便于控制细节风险。<br>
 *               <br>
 *               其缺点如下：<br>
 *               产品的组成部分必须相同，这限制了其使用范围。<br>
 *               如果产品的内部变化复杂，该模式会增加很多的建造者类。<br>
 * @author lh2
 * @date 2020年6月12日 下午4:41:08
 */
public class Test
{
	public static void main(String[] args)
	{
		PersonDirector pd = new PersonDirector();
		Person manPerson = pd.constructPerson(new ManBuilder());
		System.out.println(manPerson);

		Person womanPerson = pd.constructPerson(new WomanBuilder());
		System.out.println(womanPerson);
	}
}
