package gb.oop.hw.market;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        market.acceptToMarket(new Human("Висилий"));
        market.acceptToMarket(new Human("Петр"));
        market.acceptToMarket(new Human("Анатолий"));
        market.update();
        market.acceptToMarket(new Human("Евгений"));
        market.acceptToMarket(new Human("Егор"));
        market.update();
        market.acceptToMarket(new Human("Сергей"));
        market.update();
        market.acceptToMarket(new Human("Георгий"));
    }
}
