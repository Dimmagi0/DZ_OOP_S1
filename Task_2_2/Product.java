package Task_2_2;

public abstract class Product {
    private String name; // имя продукта
    private int cost; // стоимость продукта
    public Product(String name, int cost){
        this.name = name;
        this.cost = cost;
    }

// Alt + Insert создает автоматич. getter/setter
    public String getName() {
        return name;
    }
    public int getCost(){
        return cost;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    } // делается автоматически так-же через Alt + Insert

}


