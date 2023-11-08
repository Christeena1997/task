package Abstract;

public abstract class Furniture {
	public abstract String MaterialType(String a);

	public abstract int Price(int price, int percentage);

	public void isWood(boolean a) {
		System.out.println(a);
	}
}
