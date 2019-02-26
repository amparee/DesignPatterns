package Template;

public class Tea extends CaffeineBeverage{



    @Override
    public void brew() {

    }

    @Override
    public void addCondiments() {

    }


    private void brewTeaGrinds() {
        System.out.println("Dripping tea through filter");
    }



    private void addLemon() {
        System.out.println("Adding lemon");
    }


}
