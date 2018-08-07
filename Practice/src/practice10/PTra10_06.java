package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		Car[] car = new Car[3];

		//インスタンス作成
		for(int i=0; i<car.length; i++) {
			car[i] = new Car();
		}

		System.out.println("各車の情報を入力します。");
		System.out.println();

		//色とガソリン量の代入
		for(int i=0; i<car.length; i++) {
			System.out.println((i+1) + "台目の車の色とガソリンの量をカンマ区切りで入力してください。");
			String line = scanner.nextLine();
			String[] info = line.split(",",0);

			car[i].color = info[0];
			car[i].gasoline = Integer.parseInt(info[1]);
		}

		//目的地までの距離
		final int distance = 300;

		//車の台数分だけrunメソッドを実行
		for(int i=0; i<car.length; i++) {
			System.out.println(car[i].color + "色の車は、");
			for(int n=1, dis=0; dis < distance; n++) {
				if(car[i].run() != -1) {
					dis += car[i].run();
					if(dis >= distance) {
						System.out.println("目的地まで" + n + "時間かかりました。残りのガソリンは、" + car[i].gasoline + "リットルです。");
					}
				}else{
					System.out.println("目的地に到達できませんでした");
					break;
				}
			}
		}
	}
}
