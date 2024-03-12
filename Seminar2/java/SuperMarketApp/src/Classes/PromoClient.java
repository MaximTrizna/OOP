package Classes;

import Interfaces.iReturnOrder;

public class PromoClient extends Actor implements iReturnOrder {
    private static int id;
    private static int participantsNumber;
    private String nameOfPromo;

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

    public static void setParticipantsNumber(int participantsNumber) {
        PromoClient.participantsNumber = participantsNumber;
    }

    public void setNameOfPromo(String nameOfPromo) {
        this.nameOfPromo = nameOfPromo;
    }

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
