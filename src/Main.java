public class Main {
    public static void main(String[] args) {
        byte a = 100;
        short b = 1000;
        int c = 100000;
        long d = 1000000L;
        float e = 1.15f;
        double f = 31.07;
        var g = 0;

        float weightFirstBoxer = 78.2f;
        float weightSecondBoxer = 82.7f;
        float generalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("Общий вес равен: " + generalWeight + " кг!");
        float differenceWeight = generalWeight % weightFirstBoxer;
        System.out.println("Разница в весе составляет: " + differenceWeight + " кг!");

        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int egg = 4;
        int weightBananas = 80 * bananas;
        int weightMilk = 105 * milk;
        int weightIceCream = 100 * iceCream;
        int weightEgg = 70 * egg;
        int generalWeightGram = weightBananas + weightMilk + weightIceCream + weightEgg;
        System.out.println("Общий вес продуктов в граммах: " + generalWeightGram);
        float generalWeightKg = generalWeightGram / 1000f;
        System.out.println("Общий вес продуктов: " + generalWeightKg + " кг!");

        int weightGoal = 7000;
        int weight250 = 250;
        int weight500 = 500;
        int dayWith250 = weightGoal / weight250;
        System.out.println("За " + dayWith250 + " дней если будет терять по 250 грамм");
        int dayWith500 = weightGoal / weight500;
        System.out.println("За " + dayWith500 + " дней если будет терять по 500 грамм");

        int payDayMasha = 67760;
        int payDayDenis = 83690;
        int payDayKristina = 76230;
        int salaryIncreasedByMasha = payDayMasha / 10;
        int salaryIncreasedByDenis = payDayDenis / 10;
        int salaryIncreasedByKristina = payDayKristina / 10;
        System.out.println("Зарплата Маши изменилась на " + salaryIncreasedByMasha + " руб");
        System.out.println("Зарплата Дениса изменилась на " + salaryIncreasedByDenis + " руб");
        System.out.println("Зарплата Кристины изменилась на " + salaryIncreasedByKristina + " руб");
        payDayMasha = payDayMasha + salaryIncreasedByMasha;
        payDayDenis = payDayDenis + salaryIncreasedByDenis;
        payDayKristina = payDayKristina + salaryIncreasedByKristina;
        System.out.println("Новая зарплата Маши равна " + payDayMasha + " руб");
        System.out.println("Новая зарплата Дениса равна " + payDayDenis + " руб");
        System.out.println("Новая зарплата Кристины равна " + payDayKristina + " руб");
    }
}