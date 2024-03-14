package Classes;

import Interfaces.iReturnOrder;

/**
 * Подкласс описывает клиента, участвующего в акции
 */
public class PromoClient extends Actor implements iReturnOrder {
    private static int id; // номер участника акции
    private static int participantsNumber; // предельное количество участников акции
    private String nameOfPromo; // наименование акции

    /**
     * @param name имя акционного клиента
     * @param id номер акционного клиента
     */
    public PromoClient(String name, int id) {
        super(name);
        PromoClient.id = id;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        this.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        this.isMakeOrder = val;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    /**
     * @param participantsNumber предельное количество участников акции
     */
    public static void setParticipantsNumber(int participantsNumber) {
        PromoClient.participantsNumber = participantsNumber;
    }

    /**
     * @param nameOfPromo наименование акции
     */
    public void setNameOfPromo(String nameOfPromo) {
        this.nameOfPromo = nameOfPromo;
    }

    /**
     * Метод, определяющий попадает ли номер акционного клиента в установленный лимит участников акции
     */
    public void setClientNumber() {
        if (id > participantsNumber) {
            System.out.println("Клиент " + super.name + " в акции " + nameOfPromo + " не участвует по причине превышения допустимого кол-ва участников");
        } else {
            System.out.println("Клиент " + super.name + " участвует в акции " + nameOfPromo);
        }
    }

    @Override
    public void returnOrder() {
        if (id > participantsNumber) {
            System.out.println("Клиент " + super.name + " вернул товар, который мы не продали ему по акции " + nameOfPromo);
        }
    }
}
