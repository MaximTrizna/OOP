package Interfaces;

import java.util.List;

import Classes.Actor;

public interface iMarcketBehaviour {
    void acceptToMarket(iActorBehaviour actor);
    void releseFromMarket(List<Actor> actors);
    void update();
}
