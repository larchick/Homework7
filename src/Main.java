public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int currentMoney = 0;
        int salary = 15000;
        int total = 2_459_000;
        int month = 1;
        while (currentMoney <= total) {
            currentMoney += salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
            ++month;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int min = 1;
        while (min <= 10) {
            System.out.print(min + " ");
            min = min + 1;
        }
        System.out.println();
        for (int max = 10; max >= 1; max--) {
            System.out.print(max + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int year = 10;
        int mortality = 8;
        int fertility = 17;
        for (int i = 1; i <= year; ++i) {
            population += (population / 1000 * (fertility - mortality));
            System.out.println("Год " + i + ", численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        double deposit = 15000;
        int totalMoney = 12_000_000;
        int percent = 7;
        int month = 1;

        while (deposit <= totalMoney) {

            deposit *= (1 + (double) percent / 100);
            System.out.println("Месяц " + month + ", накопления = " + deposit);
            ++month;

        }

    }

    public static void task5() {
        System.out.println("Задача 5");
        double deposit = 15000;
        int totalMoney = 12_000_000;
        double percent = 0.07;
        int month = 1;

        while (deposit <= totalMoney) {

            deposit *= (1 + percent);

            if (month % 6 == 0) {

                System.out.println("Месяц " + month + ", накопления = " + deposit);
            }
            ++month;
        }

    }


    public static void task6() {
        System.out.println("Задача 6");
        double deposit = 15000;
        double percent = 0.07;

        for (int month = 1; month < 9 * 12; ++month) {
            deposit *= (1 + percent);

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", накопления = " + deposit);
            }
        }


    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;

        for (int i = firstFriday; i <=31; i+=7){
            System.out.println("Сегодня пятница, " + i + " число.");
        }

    }

    public static void task8() {
        System.out.println("Задача 8");

        int currentYear = 2023;
        int fromYear = currentYear - 200;
        int toYear = currentYear + 100;

        for (int i = fromYear; i <= toYear; i++){

            if (i % 79 == 0){
                System.out.println(i);
            }
        }

    }
}