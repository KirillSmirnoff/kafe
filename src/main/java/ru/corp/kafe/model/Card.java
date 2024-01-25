package ru.corp.kafe.model;

import java.time.LocalDate;


public class Card {
    private String number;
    private String cvc;
    public String name;
    private String sum;

    public LocalDate date ;


    public Card(String name) {
        this.name = name;
        this.cvc = generateCVC();
        this.number = generateNumber();
        this.date=LocalDate.now().plusYears(3);
        this.sum=generateSum();

    }

    private String generateSum() {
        StringBuilder af = new StringBuilder();
        for (int i = 5; i > 0; i--) {
            int x = (int) (Math.random() * 9);
            af.append(x);}

        return af.toString();
    }

    private String generateNumber() {

        StringBuilder af = new StringBuilder();
        for (int i = 10; i > 0; i--) {
            int x = (int) (Math.random() * 9);
            af.append(x);}

        return af.toString();


    }

    private String generateCVC() {
        StringBuilder af=new StringBuilder();
        for(int i=3;i>0;i--){
        int x = (int) (Math.random() * 9);
        af.append(x);}
        return af.toString();
    }

    public void info(){
        System.out.println(cvc);
        System.out.println();
        System.out.println(number);
        System.out.println();
        System.out.println(sum+" руб.");
    }
}

