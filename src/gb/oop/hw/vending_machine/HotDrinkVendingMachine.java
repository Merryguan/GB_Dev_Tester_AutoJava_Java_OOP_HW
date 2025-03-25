package gb.oop.hw.vending_machine;

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

    public HotDrinkExt getProduct(String name, Integer volume, Integer temperature) {
        for (Product product: productList) {
            if (product instanceof HotDrinkExt) {
                if (product.getName().equals(name)
                        && ((HotDrinkExt) product).getVolume().equals(volume)
                        && ((HotDrinkExt) product).getTemperature().equals(temperature)) {
                    return (HotDrinkExt) product;
                }
            }
        }
        return null;
    }
}
