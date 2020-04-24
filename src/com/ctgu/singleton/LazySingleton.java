package com.ctgu.singleton;

/**
 * @ClassName: LazySingleton
 * @Description: 懒汉式单例模式<br>
 *               特点：是类加载时没有生成单例，只有当第一次调用 getlnstance() 方法时才去创建这个单例
 * @author lh2
 * @date 2020年4月24日 上午10:20:00
 */
public class LazySingleton
{
	// volatile的作用：保证 instance 在所有线程中同步
	private static volatile LazySingleton instance = null;

	// 构造方式设置为private，防止类在外部被实例化
	private LazySingleton()
	{
	}

	// getInstance 方法前加同步
	public static synchronized LazySingleton getInstance()
	{
		if (instance == null)
		{
			instance = new LazySingleton();
		}
		return instance;
	}

}
