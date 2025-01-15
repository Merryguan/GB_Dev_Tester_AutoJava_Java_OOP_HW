package gb.oop.hw.vending_machine;

public class HotDrink extends Product {

    private Integer volume;
    private Integer temperature;

    public HotDrink(String name, Integer price) {
        super(name, price);
    }

    public HotDrink(String name, Integer price, Integer volume, Integer temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + getName() +
                ", volume=" + getVolume() +
                ", temperature=" + getTemperature() +
                '}';
    }
}
