package Task_2_2;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<Product> productList;
    public void initProduct(List<Product> productList){
        this.productList = productList;
    }
    public Product getProduct(String name){
        for (Product product : productList){
            if (product.getName().equals(name)){
                return product;
            }
        }
        return null;
    }
    public Product getProduct(String name, int volume, int temperature){
        for (Product product : productList){
            if (product.getName().equals(name) &&
                    ((HotDrink)product).getVolume() == volume &&
                    ((HotDrink)product).getTemperature() == temperature){
                return product;
            }
        }
        return null;
    }
}
