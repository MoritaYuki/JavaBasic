package practice10;
/*
 * PTra10_05.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_05 {

	/*
	 * 以下の仕様のクラスを作成してください（新しくJavaファイルを作成してください）
	 *
	 * クラス名
	 * 		Car
	 * フィールド
	 * 		serialNo		:	int型
	 * 		color			：	String型
	 * 		gasoline		：	int型
	 * メソッド
	 * 		戻り値(int)、メソッド名(run)、引数(なし)
	 * 			ガソリンを1消費して、ランダムな距離(1～15)進む（戻り値が進んだ距離）
	 * 			ガソリンが負の数になった場合（もう進めない）は-1を返します。
	 */

	public static void main(String[] args) {

		// Carクラスを作成後に着手してください
		// ★ Car型の変数carを宣言し、Carクラスのインスタンスを代入してください
		Car car = new Car();

		// ★ 変数carに格納されているインスタンスのserialNoフィールドに、10000を代入してください
		car.serialNo = 10000;

		// ★ 変数carに格納されているインスタンスのcolorフィールドに、"Red"を代入してください
		car.color = "Red";

		// ★ 変数carに格納されているインスタンスのgasolineフィールドに、50を代入してください
		car.gasoline = 50;

		// 目的地までの距離
		final int distance = 300;

		/*
		 * ★ 変数carに格納されているインスタンスメソッドrunを使って、目的地まで進んでください
		 * ★ 先にガソリンがなくなった場合は、「目的地に到達できませんでした」を出力してください
		 * ★ 目的地についた時点で「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください
		 * ※n：runメソッドを実行した回数, xは残りのガソリンの数です
		 */

		for(int count = 1, dis = 0; dis < distance; count++) {
			//ガソリン残量があるか判定
			if(car.run() == -1){
				System.out.println("目的地に到達できませんでした");
				break;
			}

			//進んだ距離を加算
			dis += car.run();

			//経過の表示
			System.out.println(count + "時間で" + dis + "km進みました。残り：" + (distance-dis) + "km\n");

			//目的地に着いたか判定
			if(dis >= distance) {
				System.out.println("目的地まで" + count + "時間かかりました。残りのガソリンは、" + car.gasoline + "リットルです。");
			}
		}
	}
}
