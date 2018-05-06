package com.zxl;

public class TestCase3 {
	public static String test1() {
		return "张星亮";

	}
	public static String test2() {
		String s=test1();
		if("张星亮".equals(s)) {
			System.out.println(111);
		}
		return "张星亮";
		
	}

	public static void main(String[] args) {
		System.out.println("我是合并后的");
		System.out.println("我是合并后的提交3张星亮不去掉");
	}

}
