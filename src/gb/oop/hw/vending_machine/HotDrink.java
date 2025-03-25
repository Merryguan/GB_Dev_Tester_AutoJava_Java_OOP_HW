package gb.oop.hw.vending_machine;

public class HotDrink extends Product {

    private Integer volume;

    public HotDrink(String name, Integer price) {
        super(name, price);
    }

    public HotDrink(String name, Integer price, Integer volume) {
        super(name, price);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }


    @Override
    public String toString() {
        return "HotDrink{" +
                "name=" + getName() +
                ", volume=" + getVolume() +
                '}';
    }
}
