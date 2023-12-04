package model;

public class Card {
    private int number;
    private int date;
    public String Person;
    private int cvc;

    public Card(String person ){
        this.Person=person;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getCvc() {
        return cvc;
    }
//        public void info(){
//        System.out.println("my number" +number);
//            System.out.println(cvc);
//            System.out.println(date);
//    }
}

