package Interfaces;

import java.util.List;

import Classes.Actor;

/**
 * Интерфейс действий покупателя в супермаркете
 */
public interface iMarcketBehaviour {
    /**
     * Вход клиента в магазин
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Выход клиента из магазина
     */
    void releseFromMarket(List<Actor> actors);

    /**
     * Последовательность действий клиента в магазине
     */
    void update();
}
