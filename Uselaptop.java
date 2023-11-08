package Abstract;

public class Uselaptop {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		System.out.println(l.Brand("Dell"));
		System.out.println(l.Price(55000));
		l.Color("Black");
		l.iswireless(false);
	}

}
