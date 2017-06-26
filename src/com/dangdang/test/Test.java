package com.dangdang.test;

public class Test {

	public void test1() {
		System.out.println("test1执行");
		return;
	}

	public void test2() {
		System.out.println("test2执行");
	}

	public static void main(String[] args) {
		int a = 1;
		Test test = new Test();
		test.test1();
		test.test2();
		test.test2();
test.test2();
		test.test2();
		test.test2();
		test.test2();
		test.test2();
	}

}
