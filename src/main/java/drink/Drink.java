package drink;

public class Drink {
    private int value;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void cost(){
        int x=value*price;
        System.out.println("Ваша цена   :"+x);
    }

}
