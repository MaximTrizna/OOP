package Interfaces;

import Classes.Actor;

/**
 * Интерфейс покупателя
 */
public interface iActorBehaviour {

    boolean isTakeOrder();
    boolean isMakeOrder();
    void setTakeOrder(boolean val);
    void setMakeOrder(boolean val);
    Actor getActor();


}
