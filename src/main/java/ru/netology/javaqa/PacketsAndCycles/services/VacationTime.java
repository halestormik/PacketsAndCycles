package ru.netology.javaqa.PacketsAndCycles.services;
public class VacationTime {
    public int calculate(int income, int expense, int treshold) {
        int count = 0; // счётчик месяцев отдыха
       // int income = 10_000; // зарплата в месяц
        //int expense = 3000; // ежемесячные расходы
        int vacationExpence; // траты на отдых
        int money = 0; // количество денег на счету
       // int treshold = 20_000; // порог накоплений, после которого можно отдыхать

        for (int month = 1; month <= 12; month++) {
            if (money >= treshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                vacationExpence = (money - expense) / 3 * 2;

                System.out.println("Месяц "+  month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expense + ", затем еще -" + vacationExpence);

                money = (money - expense) / 3;
            } else {
                System.out.println("Месяц "+  month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expense);

                money = money + income - expense;
            }
        }
        return count;
    }
}
