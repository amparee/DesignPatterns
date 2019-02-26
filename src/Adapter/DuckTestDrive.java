package Adapter;

public class DuckTestDrive {

    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter =new TurkeyAdapter(turkey);

        System.out.println("The turkey says...");
        turkey.fly();
        turkey.gobble();

        System.out.println("The duck says...");
        testDuck(duck);

        System.out.println("The turkey adapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.fly();
        duck.quack();
    }
}
