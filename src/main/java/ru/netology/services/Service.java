package ru.netology.services;

public class Service {
    public int calculate(int income, int expenses, int threshold) {

        int money = 0;
        int count = 0;

        System.out.println("Месяц " + "1" + "." + " Денег " + money + "." + " Придется работать");

        for (int month = 2; month <= 12; month++) {
            if (money < threshold) {
                money = money + income - expenses;
            } else {
                money = (money - expenses) / 3;
                count++;
            }
            if (money < threshold) {
                System.out.println("Месяц " + month + "." + " Денег " + money + "." + " Придется работать");
            } else {
                System.out.println("Месяц " + month + "." + " Денег " + money + "." + " Буду отдыхать");
            }
        }
        return count;
    }
}