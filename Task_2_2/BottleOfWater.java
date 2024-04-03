package Task_2_2;

public class BottleOfWater extends Product {
    private int volume;

    public BottleOfWater(int cost, String name, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "volume=" + volume +
                ", name='" + super.getName() + '\'' +
                ", cost=" + super.getCost() +
                '}';
    }
}
