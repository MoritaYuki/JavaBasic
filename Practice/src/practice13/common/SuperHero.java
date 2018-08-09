package practice13.common;

public class SuperHero extends Hero {
	/*
	 * ★ common.Heroクラスを継承した、common.SuperHeroクラスを作成してください
	 * 	●HP, POWER, ENDURANCEはそれぞれ、（25, 10, 7）
	 *
	 * フィールド
	 * 		equipment	:	common.Item
	 * メソッド
	 * 		attackメソッドをオーバーライドし、
	 * 		powerに加えて、additionalDamage分を加算した値としてください
	 *
	 * 		equipmentのアクセサ
	 */

	/*（メモ）
	*equipmentにすぐインスタンスを代入せずとも、変数を用意することでItemクラスのフィールドやメソッドを
	*呼び出す（予定）を組むことはできる。ただし、実際に実行する段階でセッターを用いてequipmentに
	*インスタンスを代入しなければ、ぬるぽでエラーが起こるため、忘れてはいけない。
	*/
	practice13.common.Item equipment;

	public int attack() {
		return (super.attack() + this.equipment.getAdditionalDamage());
	}

	//ゲッター
	public Item getEquipment(){
		return this.equipment;
	}

	//セッター
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

}
