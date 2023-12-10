package model;

import java.time.LocalDate;


public class Card {
    private String number;
    private String cvc;
    public String name;

    public LocalDate date ;


    public Card(String name) {
        this.name = name;
        this.cvc = generateCVC();
        this.number = generateNumber();
        this.date=LocalDate.now().plusYears(3);

    }

    private String generateNumber() {  int i = (int) (Math.random() * 9);
        String str=Integer.toString(i);

        int a = (int) (Math.random() * 9);

        int b = (int) (Math.random() * 9);
        int c = (int) (Math.random() * 9);
        int v = (int) (Math.random() * 9);
        int d = (int) (Math.random() * 9);
        int e = (int) (Math.random() * 9);
        int x = (int) (Math.random() * 9);
        int o = (int) (Math.random() * 9);
        StringBuilder af = new StringBuilder(str);
        af.append(a).append(b).append(c).append(v).append(d).append(e).append(x).append(o);
        return ""+af;


    }

    private String generateCVC() {
        int i = (int) (Math.random() * 9);
        String str=Integer.toString(i);

        int a = (int) (Math.random() * 9);

        int b = (int) (Math.random() * 9);

        StringBuilder af = new StringBuilder(str);
        af.append(a).append(b);
        return ""+af;
    }

    public void info(){
        System.out.println(cvc);
        System.out.println();
        System.out.println(number);
    }
}

