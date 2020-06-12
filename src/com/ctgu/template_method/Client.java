package com.ctgu.template_method;

/**
 * @ClassName: Client
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:28:10
 */
public class Client
{
	public static void main(String[] args)
	{
		Student student = new Student();
		student.prepareGotoSchool();

		Teacher teacher = new Teacher();
		teacher.prepareGotoSchool();
	}
}
