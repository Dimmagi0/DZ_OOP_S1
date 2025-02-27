package Task_2_2;

import java.util.List;

public class BottleOfWaterVendingMachine implements VendingMachine {
    private List<Product> productList;

    public void initProduct(List<Product> productList) {
        this.productList = productList;
    }

    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null; // Если товар не найден
    }
    public Product getProduct(String name, int volume) {
        for (Product product : productList) {
            if (product.getName().equals(name) &&
                    ((BottleOfWater)product).getVolume() == volume){
                return product;
            }
        }
        return null;
    }
}
