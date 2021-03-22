package com.lutsenko;

public class BankAccount {
    private String name;
    private double count;


    public BankAccount(String name, double count) {
        this.name = name;
        this.count = count;
    }

    public void add(double money) {
        double commissionForAdd = money * 0.005;
        this.count = money - commissionForAdd;

    }

    public void transfer(BankAccount otherPerson, double money) {
        if (count < money) {
            throw new IllegalArgumentException("NOT ENOUGH MONEY");
        }
        double commissionForTransfer = money * 0.01;
        this.count = count - money;
        otherPerson.count = money - commissionForTransfer;

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
