package com.ctgu.proxy;

/**
 * @ClassName: ProxyClass
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:12:15
 */
public class ProxyClass implements BuyCar
{
	private People people;

	public People getPeople()
	{
		return people;
	}

	public void setPeople(People people)
	{
		this.people = people;
	}

	@Override
	public void buyMycar()
	{
		if (people.getVip() == "vip")
		{
			people.buyMycar();
			return;
		}
		if (people.getCash() >= 50000)
		{
			System.out.println(people.getUsername() + "买了新车，交易结束！");
		}
		else
		{
			System.out.println(people.getUsername() + "钱不够，不能买车，继续比赛！");
		}
	}
}
