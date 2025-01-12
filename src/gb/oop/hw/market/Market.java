package gb.oop.hw.market;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.printf("%s зашел в магазин.\n", actor.getName());
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (int i = 0; i < queue.size(); i++) {
            for (Actor actor2: actorList) {
                if (actor2 == queue.get(i)) {
                    System.out.printf("%s покинул магазин.\n", queue.get(i).getName());
                    queue.remove(i);
                    break;
                }
            }
        }
    }

    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.printf("%s встал в очередь.\n", actor.getName());
        queue.add(actor);
    }

    @Override
    public void takeOrder() {
        for (Actor actor: queue) {
            if (!actor.isMakeOrder()) {
                //System.out.printf("%s еще не сделал заказ.\n", actor.getName());
                actor.setMakeOrder(true);
            } else {
                //System.out.printf("%s уже сделал заказ.\n", actor.getName());
            }
        }
    }

    @Override
    public void giveOrder() {
        for (Actor actor: queue) {
            if (actor.isMakeOrder()) {
                //System.out.printf("%s еще не получил заказ.\n", actor.getName());
                actor.setTakeOrder(true);
            } else {
                //System.out.printf("%s уже получил заказ.\n", actor.getName());
            }
        }
    }

    @Override
    public void releaseFromQueue() {
        List<Actor> outList = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder()) {
                System.out.printf("%s вышел из очереди.\n", actor.getName());
                outList.add(actor);
            }
        }
        releaseFromMarket(outList);
    }
}
