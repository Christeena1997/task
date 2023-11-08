package Abstract;

public class UseTable {

	public static void main(String[] args) {
		Table t = new Table();
		System.out.println(t.MaterialType("student"));
		System.out.println(t.Price(1000, 5));
	}

}
