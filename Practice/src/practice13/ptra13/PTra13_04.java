/*
 * PTra13_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice13.ptra13;

public class PTra13_04 {

	/*
	 * ★ PTra13_02, PTra13_03で作成した、Hero/Slimeクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ HeroインスタンスとSlimeインスタンスを作成し、それぞれの名前に"勇者", "スライム"を設定してください
		practice13.common.Hero hero = new practice13.common.Hero();
		practice13.common.Slime slime = new practice13.common.Slime();
		
		hero.setName("勇者");
		slime.setName("スライム");

		/*
		 * ★ HeroとSlimeを、どちらかが体力０になるまで戦わせます
		 *
		 * 	●Heroの攻撃 -> ダメージ判定 -> Slimeの攻撃 -> ダメージ判定
		 * 上記を繰り返し行います
		 */
		
		while(true) {
		// ★ 勝利した方の出力を行ってください。「○○は■■との戦闘に勝利した」
			
			System.out.println(hero.getName() + "の攻撃");
			if(slime.damage(hero.attack())) {
				System.out.println(slime.getName() + "は倒れた・・・\n");
				System.out.println("勇者はスライムとの戦闘に勝利した");
				break;
			}
			
			System.out.println(slime.getName() + "の攻撃");
			if(hero.damage(slime.attack())) {
				System.out.println(hero.getName() + "は倒れた・・・\n");
				System.out.println("スライムは勇者との戦闘に勝利した");
				break;
			}
		}
	}
}
	
