package com.ctgu.template_method;

/**
 * @ClassName: Student
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:28:16
 */
public class Student extends AbstractPerson
{
	@Override
	protected void dressUp()
	{
		System.out.println("student穿校服");
	}

	@Override
	protected void eatBreakfast()
	{
		System.out.println("student吃妈妈做好的早饭");
	}

	@Override
	protected void takeThings()
	{
		System.out.println("student背书包，带上老师布置的家庭作业");
	}
}
