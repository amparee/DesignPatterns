package Factory;

public class PizzaStoreSimulator {

	public static void main(String[] args) {

		PizzaStore nyStore = new NYPizzaFactory();
		PizzaStore chicagoStore = new ChicagoStylePizzaStore();
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

	}

}
