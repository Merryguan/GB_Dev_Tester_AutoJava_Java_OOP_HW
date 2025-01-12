package gb.oop.hw.market;

public interface QueueBehaviour {

    void takeInQueue(Actor actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
