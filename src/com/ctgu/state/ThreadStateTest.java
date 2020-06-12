package com.ctgu.state;

/**
 * @ClassName: ThreadStateTest
 * @Description: 状态模式：<br>
 *               对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，<br>
 *               允许状态对象在其内部状态发生改变时改变其行为。
 *               <p>
 *               线程状态参考：https://blog.csdn.net/pange1991/article/details/53860651<br>
 *               <br>
 *               用“状态模式”设计一个多线程的状态转换程序。<br>
 *               分析：多线程存在 5 种状态，分别为新建状态、就绪状态、运行状态、阻塞状态和死亡状态，<br>
 *               各个状态当遇到相关方法调用或事件触发时会转换到其他状态<br>
 *               现在先定义一个抽象状态类（TheadState），然后为每个状态设计一个具体状态类，<br>
 *               它们是新建状态（New）、就绪状态（Runnable ）、运行状态（Running）、阻塞状态（Blocked）和死亡状态（Dead）<br>
 *               每个状态中有触发它们转变状态的方法，环境类（ThreadContext）中先生成一个初始状态（New），并提供相关触发方法<br>
 *               <p>
 *               状态变化：<br>
 *               （1）就绪----->运行：<br>
 *               ①获得CPU资源
 *               <p>
 *               （2）运行----->阻塞：<br>
 *               ①线程通过调用sleep方法进入睡眠状态；<br>
 *               ②线程调用一个在I/O上被阻塞的操作，即该操作在输入输出操作完成之前不会返回到它的调用者；<br>
 *               ③线程试图得到一个锁，而该锁正被其他线程持有；<br>
 *               ④线程在等待某个触发条件；
 *               <p>
 *               （3）运行----->死亡：<br>
 *               ①run方法正常退出而自然死亡；<br>
 *               ②一个未捕获的异常终止了run方法而使线程猝死；<br>
 * @author lh2
 * @date 2020年6月12日 下午5:18:07
 */
public class ThreadStateTest
{
	public static void main(String[] args)
	{
		ThreadContext context = new ThreadContext();
		context.start();
		context.getCPU();
		context.suspend();
		context.resume();
		context.getCPU();
		context.stop();
	}
}
