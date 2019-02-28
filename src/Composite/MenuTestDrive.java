package Composite;

public class MenuTestDrive {

    PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
    DinerMenu   dinerMenu = new DinerMenu();
    CafeMenu cafeMenu = new CafeMenu();

    Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);

    waitress.printMenu();


}
