package gb.oop.hw;

import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {

    private final List<Product> productList;
    private Integer money;

    public HotDrinkVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money = money + product.getPrice();
                return product;
            }
        }
        return null;
    }

    public HotDrink getProduct(String name, Integer volume, Integer temperature) {
        for (Product product: productList) {
            if (product instanceof HotDrink) {
                if (product.getName().equals(name)
                        && ((HotDrink) product).getVolume().equals(volume)
                        && ((HotDrink) product).getTemperature().equals(temperature)) {
                    return (HotDrink) product;
                }
            }
        }
        return null;
    }
}
