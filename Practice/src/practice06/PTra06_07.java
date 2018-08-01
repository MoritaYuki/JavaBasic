package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */

		//5行目まで
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("■");
			}
			for(int k=i; k<5; k++) {
				System.out.print("□");
			}
			System.out.println();
		}

		//6行目以降
		for(int i=5; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("■");
			}
			for(int k=i; k<5; k++) {
				System.out.print("□");
			}
			System.out.println();
		}

	}
}
