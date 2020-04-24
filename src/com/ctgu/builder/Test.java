package com.ctgu.builder;

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
