package ru.corp.kafe.model.dto;

public class CheckDTO {

    private int summa;
    private int orderNumber ;


    public CheckDTO(int orderNumber, int summa) {
        this.summa = summa;
        this.orderNumber = orderNumber;
    }

    public int getSumma() {
        return summa;
    }

    public void setSumma(int summa) {
        this.summa = summa;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}
