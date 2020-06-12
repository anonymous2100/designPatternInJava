package com.ctgu.responsibility_chain;

/**
 * @ClassName: Client
 * @Description: 责任链模式：<br>
 *               为了避免请求发送者与多个请求处理者耦合在一起，<br>
 *               将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；<br>
 *               当有请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。<br>
 *               <br>
 *               责任链模式也叫职责链模式。<br>
 * @author lh2
 * @date 2020年6月12日 下午5:14:01
 */
public class Client
{

	public static void main(String[] args)
	{
		// 先要组装责任链
		Handler h1 = new GeneralManager();
		Handler h2 = new DeptManager();
		Handler h3 = new ProjectManager();
		h3.setSuccessor(h2);
		h2.setSuccessor(h1);

		// 开始测试
		String test1 = h3.handleFeeRequest("张三", 300);
		System.out.println("test1 = " + test1);
		String test2 = h3.handleFeeRequest("李四", 300);
		System.out.println("test2 = " + test2);
		System.out.println("---------------------------------------");

		String test3 = h3.handleFeeRequest("张三", 700);
		System.out.println("test3 = " + test3);
		String test4 = h3.handleFeeRequest("李四", 700);
		System.out.println("test4 = " + test4);
		System.out.println("---------------------------------------");

		String test5 = h3.handleFeeRequest("张三", 1500);
		System.out.println("test5 = " + test5);
		String test6 = h3.handleFeeRequest("李四", 1500);
		System.out.println("test6 = " + test6);
	}

}
