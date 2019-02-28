package Composite;

public class DinerMenu {

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    // constructor here
    // addItem here


    public DinerMenu(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
