package com.ctgu.builder;

/**
 * @ClassName: PersonDirector
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:41:02
 */
public class PersonDirector
{
	public Person constructPerson(PersonBuilder pb)
	{
		pb.buildHead();
		pb.buildBody();
		pb.buildFoot();
		return pb.buildPerson();
	}
}
