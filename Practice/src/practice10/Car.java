package practice10;

public class Car {

	int serialNo;
	String color;
	int gasoline;

	public int run() {
		java.util.Random rand = new java.util.Random();

		this.gasoline--;
		//ガソリンが無くなった場合
		if(this.gasoline < 0) {
			return -1;
		}else {
		//1～15まででランダムに進んだ距離を返す
			return (rand.nextInt(15) + 1);
		}
	}
}
