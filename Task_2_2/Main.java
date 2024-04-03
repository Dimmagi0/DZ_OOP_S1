package Task_2_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new HotDrink(200, "Coffee", 180, 95));
        productList.add(new HotDrink(250, "Cocoa", 200, 95));
        productList.add(new HotDrink(300, "HotChocolate", 200, 90));
        productList.add(new HotDrink(100, "BlackTea", 100, 90));
        productList.add(new HotDrink(200, "BlackTea", 200, 85));
        productList.add(new HotDrink(150, "GreenTea", 150, 85));

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.initProduct(productList);

        System.out.println("__________________________________");
        System.out.println(vendingMachine.getProduct("Coffee"));
        System.out.println("----------------------------------");
        System.out.println(vendingMachine.getProduct("Cocoa"));
        System.out.println("----------------------------------");
        System.out.println(vendingMachine.getProduct("GreenTea"));
        System.out.println("----------------------------------");
        System.out.println(vendingMachine.getProduct("BlackTea", 150, 85));
        System.out.println("----------------------------------");
    }
}
