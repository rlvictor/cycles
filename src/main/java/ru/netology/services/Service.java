package ru.netology.services;

public class Service {


    public int calculate(int income, int expenses, int threshold) {

        int money = 0;
        int count = 1;
        int result = 0;

        System.out.println("Месяц " + count + "." + " Денег " + money + "." + " Придется работать");

        for (int month = 2; month <= 12; month++) {
            count++;
            if (money + income - expenses < threshold) {
                money = money + income - expenses;
                System.out.println("Месяц " + count + "." + " Денег " + money + "." + " Придется работать");

            } else {
                money = money + income - expenses;
                result += 1;
                System.out.println("Месяц " + count + "." + " Денег " + money + "." + " Буду отдыхать");
                month++;
                count++;
                money = (money - expenses) / 3;
                System.out.println("Месяц " + count + "." + " Денег " + money + "." + " Придется работать");
            }

        }
        return result;
    }
}