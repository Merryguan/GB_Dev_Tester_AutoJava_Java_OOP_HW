package gb.oop.hw.vending_machine;

public class HotDrinkExt extends HotDrink {

    private Integer temperature;

    public HotDrinkExt(String name, Integer price, Integer volume) {
        super(name, price, volume);
    }

    public HotDrinkExt(String name, Integer price, Integer volume, Integer temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "HotDrinkExt{" +
                "name=" + super.getName() +
                ", temperature=" + temperature +
                '}';
    }

}
