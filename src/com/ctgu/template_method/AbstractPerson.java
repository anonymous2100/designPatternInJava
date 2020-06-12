package com.ctgu.template_method;

/**
 * @ClassName: AbstractPerson
 * @Description:
 * @author lh2
 * @date 2020年6月12日 下午5:28:04
 */
public abstract class AbstractPerson
{
	// 抽象类定义整个流程骨架
	public void prepareGotoSchool()
	{
		dressUp();
		eatBreakfast();
		takeThings();
	}

	// 以下是不同子类根据自身特性完成的具体步骤
	protected abstract void dressUp();

	protected abstract void eatBreakfast();

	protected abstract void takeThings();
}
