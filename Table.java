package Abstract;

public class Table extends Furniture {
	public String MaterialType(String a) {
		return a;
	}

	public int Price(int price, int percentage) {
		return price - (price * percentage / 100);
	}

}
