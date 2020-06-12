package com.ctgu.builder;

/**
 * @ClassName: PersonBuilder
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午4:40:58
 */
public interface PersonBuilder
{
	void buildHead();

	void buildBody();

	void buildFoot();

	Person buildPerson();
}
