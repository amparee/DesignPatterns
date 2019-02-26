package Decorator;

public class BeverageSimulator {

	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBland();
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		

		
	}

}
