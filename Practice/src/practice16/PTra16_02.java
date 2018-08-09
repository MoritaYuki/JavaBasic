/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		Boolean br = b;
		Byte byr = by;
		Short sr = s;
		Character cr = c;
		Integer ir = i;
		Long lr = l;
		Float fr = f;
		Double dr = d;

		System.out.println(br);
		System.out.println(byr);
		System.out.println(sr);
		System.out.println(cr);
		System.out.println(ir);
		System.out.println(lr);
		System.out.println(fr);
		System.out.println(dr);
	}
}
