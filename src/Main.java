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
        calculatingTheDelivery(deliveryDistance);
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



    public static String calculatingTheDelivery(int deliveryDistance) {
        int time = 1;
        if (deliveryDistance < 20) {
        } else if ((deliveryDistance >= 20) && (deliveryDistance < 60)) {
            time = time++;
        } else if ((deliveryDistance >= 60) && (deliveryDistance < 100)) {
            time = time++;
        } else if (deliveryDistance > 100) {
            return "Доставки нет";
        }

    return "Потребуется дней" + time;
}
}











