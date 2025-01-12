package gb.oop.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> hotDrinkList1 = new ArrayList<>();
        hotDrinkList1.add(new HotDrink("Кофе", 150, 200, 80));
        hotDrinkList1.add(new HotDrink("Чай", 50, 300, 100));
        hotDrinkList1.add(new HotDrink("Какао", 100, 250, 70));

        HotDrinkVendingMachine hotDrinkVendingMachine1 = new HotDrinkVendingMachine(hotDrinkList1);
        System.out.print(hotDrinkVendingMachine1.getProduct("Чай", 350, 100));
        System.out.print(hotDrinkVendingMachine1.getProduct("Кофе", 200, 80));

        List<Product> hotDrinkList2 = new ArrayList<>();
        hotDrinkList2.add(new HotDrink("Кофе", 200, 250, 80));
        hotDrinkList2.add(new HotDrink("Чай", 75, 350, 100));
        hotDrinkList2.add(new HotDrink("Какао", 150, 225, 70));

        HotDrinkVendingMachine hotDrinkVendingMachine2 = new HotDrinkVendingMachine(hotDrinkList2);
        System.out.print(hotDrinkVendingMachine2.getProduct("Чай", 300, 100));
        System.out.print(hotDrinkVendingMachine2.getProduct("Какао", 225, 70));
    }
}
