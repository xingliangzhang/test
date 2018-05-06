package com.zxl;

public class TestCase1 {
	public static void test1() {
		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = new int[] { 1, 2, 3, 4, 5 };
		
		end://跳出多层循环
		for (int i = 0; i < a.length; i++) {
			//改变start
			if(a[i]==1) {
				System.out.println("我是中国人");
			}
			//改变end
			System.out.println("i="+i);
			for (int j = 0; j < b.length; j++) {
				//System.err.println("j="+j);
				if(b[j]<4) {
					System.out.println("b[j]="+b[j]);
				}else {
					System.out.println("结束循环");
					break end;
				}
			}
		}
	}

	public static void main(String[] args) {
		TestCase1.test1();
	}
}
