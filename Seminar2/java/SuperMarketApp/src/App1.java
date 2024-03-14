import Classes.*;
import Interfaces.iActorBehaviour;

public class App1 {
    /**
     * Главный метод
     */
    public static void main(String[] args) {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Борис"); // присваиваем имя первому клиенту
        iActorBehaviour client2 = new OrdinaryClient("Маша");// присваиваем имя второму клиенту
        iActorBehaviour client3 = new SpecialClient("Иван Иванович", 1); // присваиваем имя и id VIP клиенту
        iActorBehaviour client4 = new TaxInspector();
        PromoClient client5 = new PromoClient("Стас", 4); // присваиваем имя и id промо клиенту

        magnit.acceptToMarket(client1); // запускаем первого клиента в супермаркет
        magnit.acceptToMarket(client2); // запускаем второго клиента в супермаркет
        magnit.acceptToMarket(client3); // запускаем третьего клиента в супермаркет
        magnit.acceptToMarket(client4); // запускаем четвертого клиента в супермаркет
        magnit.acceptToMarket(client5); // запускаем пятого клиента в супермаркет

        PromoClient.setParticipantsNumber(3); // определяем номер промо клиента
        client5.setNameOfPromo("'ВСЕ ПО 20!!!'"); // определяем наименование первого промо
        client5.setClientNumber(); // запускаем метод, определяющий попадает ли номер акционного клиента в установленный лимит участников акции
        client5.returnOrder(); // запускам метод возврата
        PromoClient.setParticipantsNumber(8); // определяем наименование второго промо
        client5.setNameOfPromo("'ВСЕ ПО 50!!!'");
        client5.setClientNumber();
        client5.returnOrder();

        magnit.update();

    }
}
