package Domen;

public class HotDrink extends Product {
    private int tempHotDrink;

    public int getTemperature() {
        return tempHotDrink;
    }

    public void setTemperature(int tempHotDrink) { this.tempHotDrink = tempHotDrink; }

    public HotDrink(int price, int place, String name, int ID, int tempHotDrink) {
        super(price, place, name, ID);
        this.tempHotDrink = tempHotDrink;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTemperature = " + tempHotDrink;
    }
}
