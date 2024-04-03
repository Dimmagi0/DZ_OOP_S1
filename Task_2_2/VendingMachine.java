package Task_2_2;

import java.util.List;

public interface VendingMachine { // продуктовый автомат (класс будет тоговать продуктами)

    void initProduct(List<Product> productList); // init будет void

    Product getProduct(String name); // а get будет все так-же продуктовским
}

