package ru.corp.kafe.model.dto;

public class DrinkDTO {
    private String name;
    private int value;

    public DrinkDTO(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

//    public void cost(){
//        int x=value*price;
//        System.out.println("Ваша цена   :"+x);
//    }

}
