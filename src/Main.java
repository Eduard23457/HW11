import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int a = 2021;
        year(a);
        int os = 1;
        int clientDeviceYear = 2024;
        findOutTheYear(os, clientDeviceYear);
        int deliveryDistance = 95;
        int time = 1;
        calculatingTheDelivery(time, deliveryDistance);
    }


    public static void year(int yearToCheck) {
        if ((yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0)) {
            System.out.println("Год " + yearToCheck + " високосный");

        } else {
            System.out.println("Год " + yearToCheck + " не високосный");
        }
    }


    public static void findOutTheYear(int clienDeviceYear, int os) {
        if ((os == 1) && (clienDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию  приложения для Android по ссылке");
        } else if ((os == 1) && (clienDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения Android по ссылке");
        }
        if ((os == 0) && (clienDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения IOS по ссылке");
        } else if ((os == 0) && (clienDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения IOS по ссылке");

        }
    }

    public static void calculatingTheDelivery(int time, int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней" + time);
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            time = time++;
            System.out.println("Потребуется дней " + time);
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            time = time++;
            System.out.println("Потребуется дней " + time);
        } else {
            System.out.println("Доставки нет ");

        }

    }
}









