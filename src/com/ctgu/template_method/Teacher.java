package com.ctgu.template_method;

/**
 * @ClassName: Teacher
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:28:22
 */
public class Teacher extends AbstractPerson
{
	@Override
	protected void dressUp()
	{
		System.out.println("teacher穿工作服");
	}

	@Override
	protected void eatBreakfast()
	{
		System.out.println("teacher做早饭，照顾孩子吃早饭");
	}

	@Override
	protected void takeThings()
	{
		System.out.println("teacher带上昨晚备好的课程计划");
	}
}
