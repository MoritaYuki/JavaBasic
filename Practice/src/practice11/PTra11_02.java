package practice11;
/*
 * PTra11_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra11_02 {
	public static void main(String[] args) {

		// ★ ReadFileClassのクラスメソッドreadBookDataFile()を使い、本情報を取得します
		Book[] bookList = FileReaderClass.readBookDataFile();

		System.out.println("探したい本のタイトル（又はその一部）を入力してください");
		String input = new java.util.Scanner(System.in).nextLine();

		// ★ ユーザが入力した文字列が、本情報のタイトル一部に含まれていた場合は、その本情報を出力してください
		for(int i=0,k=0; i<bookList.length; i++) {
			if(bookList[i].title.indexOf(input) != -1) {
				System.out.println("-----------------------------");
				System.out.println(bookList[i].dispBookInfo());
				k++;
			}
			if(i == (bookList.length - 1) && k == 0) {
				System.out.println("お探しの書籍は見つかりませんでした。");
			}
		}
	}
}
