package decorator.coffeeshop;

public class CoffeeShop {
	public enum Size {NONE, TALL, GRANDE, VENTI};
	
	public static void main(String[] args) {
		Beverage b1 = new Espresso(Size.GRANDE);
		System.out.println(b1.toString());
		
		b1 = new Mocha(b1);
		b1 = new Milk(b1);
		System.out.println(b1.toString());
		
		Beverage b2 = new HouseBlend();
		System.out.println(b2.toString());
		
		b2 = new Whip(b2);
		System.out.println(b2.toString());
	}
}
