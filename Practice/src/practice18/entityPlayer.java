package practice18;

public class entityPlayer {
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
	
	String position;
	String name;
	String country;
	String team;
	
	//toString()のオーバーライド
	public String toString() {
		return (position + "," + name + "," + country + "," + team);
	}
	
	//ゲッター
	public String getPosition() {
		return position;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getTeam() {
		return team;
	}
	
	//セッター
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
}
