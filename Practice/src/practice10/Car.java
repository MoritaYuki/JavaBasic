package practice10;

public class Car {
	
	int seriaNo;
	String color;
	int gasoline;
	
	java.util.Random rand = new java.util.Random();

	public int run() {
		this.gasoline--;
		if(this.gasoline < 0) {
			return -1;
		}else {
			return (this.rand.nextInt(15) + 1);
		}
	}
}
