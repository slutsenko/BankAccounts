package com.lutsenko;

public class Main {

    public static void main(String[] args) {

        BankAccount boss = new BankAccount("Oleg", 0);
        BankAccount ivan = new BankAccount("Ivan", 0);
        BankAccount alex = new BankAccount("Alex", 0);
        BankAccount sergey = new BankAccount("Sergey", 0);

        boss.add(100000);
        double profit = BankAccount.commissionForAdd;

        boss.transfer(ivan, 10000);
        profit = profit + BankAccount.commissionForTransfer;

        boss.transfer(alex, 15000);
        profit = profit + BankAccount.commissionForTransfer;

        boss.transfer(sergey, 20000);
        profit = profit + BankAccount.commissionForTransfer;


        System.out.println(boss);
        System.out.println(ivan);
        System.out.println(alex);
        System.out.println(sergey);
        System.out.println("Bank has profit: " + profit);


    }
}
