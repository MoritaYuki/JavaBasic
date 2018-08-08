/*
 * PTra18_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PTra18_02 {

	/*
	 * ★ BestElevenCandidate.csvの情報を保持するためのクラス、entity.Playerクラスを作成してください
	 *
	 * フィールド
	 * 		position	：	String
	 * 		name		：	String
	 * 		country		：	String
	 * 		team		：	String
	 * メソッド
	 * 		各アクセサ
	 *
	 * 		toString()	：	Objectクラスのオーバーライド
	 * 		各フィールドの値を、カンマ区切りの文字列で取得する
	 */

	public static void main(String[] args) {

		/*
		 * entity.Playerの作成後に行ってください
		 *
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */

		entityPlayer[] Player = new entityPlayer[10000];

		ArrayList<entityPlayer> array = new ArrayList<>();
        try{
        	Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"));
        	for (int i=0; scanner.hasNext(); i++) {
                String line = scanner.nextLine();
                String[] info = line.split(",",0);

                Player[i] = new entityPlayer();
                Player[i].position = info[0];
                Player[i].name = info[1];
                Player[i].country = info[2];
                Player[i].team = info[3];

                // ★ 1行ごとにArrayListに格納してください
                array.add(Player[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません");
        }

		// ★ ArrayListに格納されているインスタンス全てのtoStringメソッドを実行し、出力してください
		// ※ できれば拡張for文を使いましょう
        for(entityPlayer player: array) {
        	System.out.println(player.toString());
        }

	}
}
