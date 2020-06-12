package com.ctgu.builder;

/**
 * @ClassName: ManBuilder
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:40:47
 */
public class ManBuilder implements PersonBuilder
{
	Person person;

	public ManBuilder()
	{
		person = new Man();
	}

	public void buildBody()
	{
		person.setBody("建造男人的身体");
	}

	public void buildFoot()
	{
		person.setFoot("建造男人的脚");
	}

	public void buildHead()
	{
		person.setHead("建造男人的头");
	}

	public Person buildPerson()
	{
		return person;
	}

}
