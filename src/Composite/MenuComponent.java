package Composite;

public abstract class MenuComponent {

    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getChild(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getName(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getDescription(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void getPrice(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    public void isVegetarian(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }


    public abstract void print();


}
