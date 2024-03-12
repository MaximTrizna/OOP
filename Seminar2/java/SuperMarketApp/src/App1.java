import Classes.*;
import Interfaces.iActorBehaviour;

public class App1 {
    public static void main(String[] args) {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Борис");
        iActorBehaviour client2 = new OrdinaryClient("Маша");
        iActorBehaviour client3 = new SpecialClient("Иван Иванович", 1);
        iActorBehaviour client4 = new TaxInspector();
        PromoClient client5 = new PromoClient("Стас", 4);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        PromoClient.setParticipantsNumber(3);
        client5.setNameOfPromo("'ВСЕ ПО 20!!!'");
        client5.setClientNumber();
        client5.returnOrder();
        PromoClient.setParticipantsNumber(8);
        client5.setNameOfPromo("'ВСЕ ПО 50!!!'");
        client5.setClientNumber();
        client5.returnOrder();

        magnit.update();

    }
}
