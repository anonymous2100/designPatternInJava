package com.ctgu.builder;

/**
 * @ClassName: WomanBuilder
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:41:18
 */
public class WomanBuilder implements PersonBuilder
{
	Person person;

	public WomanBuilder()
	{
		person = new Woman();
	}

	public void buildBody()
	{
		person.setBody("建造女人的身体");
	}

	public void buildFoot()
	{
		person.setFoot("建造女人的脚");
	}

	public void buildHead()
	{
		person.setHead("建造女人的头");
	}

	public Person buildPerson()
	{
		return person;
	}
}
