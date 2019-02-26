package Template;

public class Coffe extends  CaffeineBeverage{

    @Override
    public void brew() {
        System.out.println("Brew coffee");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar");
    }
}
