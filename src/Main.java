import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        checkingYear(2023);
        applicationVersion(0, 2022, 2023); // 1- ios, 0- android
        printDeliveryTime (20);

    }


    public static void checkingYear(int year) {
        System.out.println("Задача 1"); // для удобства чтения

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " - високосный год");
        } else {
            System.out.println(year + " - не високосный год");
        }
        System.out.println(); // просто для отступа
    }

    public static void applicationVersion (int clientOS, int yearOfPhone, int testYear) {
        System.out.println("Задача 2");

        if (clientOS == 1 && yearOfPhone >= testYear) {
            System.out.println("Установите версию приложения для iOS ");
        } else if (clientOS == 1 && yearOfPhone < testYear) {
            System.out.println("Установите облегченную версию приложения для iOS ");
        } else if (clientOS == 0 && yearOfPhone >= testYear) {
            System.out.println("Установите версию приложения для Android ");
        } else if (clientOS == 0 && yearOfPhone < testYear) {
            System.out.println("Установите облегченную версию приложения для Android ");
        } else {
            System.out.println("Введённые данные не верны");
        }


        System.out.println();
    }

    public static void printDeliveryTime(int deliveryDistance) {
        System.out.println("Задача 3");

        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется 2 дня");
        } else {
            System.out.println("Потребуется 3 дня");
        }
    }
}
