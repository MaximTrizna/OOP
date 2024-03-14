package Classes;

/**
 * Подкласс описывает VIP клиента
 */
public class SpecialClient extends Actor {

    private int idVIP;

    /**
     * @param name имя VIP клиента
     * @param idVIP id VIP клиента
     */
    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
    }

   
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder; 
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;        
    }

    public Actor getActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

}
