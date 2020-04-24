package com.ctgu.prototype;

/**
 * @ClassName: Prototype
 * @Description: 原型（Prototype）模式的定义如下：<br>
 *               用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。<br>
 *               在这里，原型实例指定了要创建的对象的种类。<br>
 *               用这种方式创建对象非常高效，根本无须知道对象创建的细节。
 *               <p>
 *               原型模式包含角色如下： <br>
 *               1、抽象原型类：规定了具体原型对象必须实现的接口 <br>
 *               2、具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。<br>
 *               3、访问类：使用具体原型类中的 clone() 方法来复制新的对象。<br>
 * @author lh2
 * @date 2020年4月24日 上午10:28:36
 */
public class Prototype implements Cloneable
{
	public Prototype clone()
	{
		Prototype prototype = null;
		try
		{
			prototype = (Prototype) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return prototype;
	}
	
	// 使用原型模式复制对象不会调用类的构造方法。
	// 因为对象的复制是通过调用Object类的clone方法来完成的，它直接在内存中复制数据，
	// 因此不会调用到类的构造方法。不但构造方法中的代码不会执行，甚至连访问权限都对原型模式无效。单例模式中，
	// 只要将构造方法的访问权限设置为private型，就可以实现单例。但是clone方法直接无视构造方法的权限，所以，
	// 单例模式与原型模式是冲突的，在使用时要特别注意。
	// 深拷贝与浅拷贝。Object类的clone方法只会拷贝对象中的基本的数据类型
	// （8种基本数据类型byte,char,short,int,long,float,double，boolean），对于数组、容器对象、引用对象等都不会拷贝，
	// 这就是浅拷贝。如果要实现深拷贝，必须将原型模式中的数组、容器对象、引用对象等另行拷贝。例如：
	//由于ArrayList不是基本类型，所以成员变量list，不会被拷贝，需要我们自己实现深拷贝，
	//java提供的大部分的容器类都实现了Cloneable接口.
	/**
		private ArrayList list = new ArrayList();
		public Prototype clone()
		{
			Prototype prototype = null;
			try
			{
				prototype = (Prototype) super.clone();
				prototype.list = (ArrayList) this.list.clone();
			}
			catch (CloneNotSupportedException e)
			{
				e.printStackTrace();
			}
			return prototype;
		}
		*/
}
