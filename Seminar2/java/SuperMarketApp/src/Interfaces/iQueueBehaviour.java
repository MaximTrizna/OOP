package Interfaces;

/**
 * Интерфейс ввода/вывода покупателя в/из очереди
 */
public interface iQueueBehaviour {
    void takeInQueue(iActorBehaviour actor);
    void releaseFromQueue();
    void takeOrder ();
    void giveOrder ();

}
