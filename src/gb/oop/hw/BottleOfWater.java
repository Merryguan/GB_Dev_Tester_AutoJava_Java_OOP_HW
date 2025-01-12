package gb.oop.hw;

public class BottleOfWater extends Product{

    private Integer volume;

    public BottleOfWater(String name, Integer price){
        super(name, price);
    }

    public BottleOfWater(String name, Integer price, Integer volume){
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
        return "BottleOfWater{" +
                "volume=" + volume +
                "name=" + getName() +
                '}';
    }
}
