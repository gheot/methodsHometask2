import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        int year = 2022;
        leapYear(year);
        String clientOs = "Android";
        int YourDeviceYear = 2021;
        checkOS(clientOs, YourDeviceYear);
        deliveryDaysCounter();


    }

    public static void leapYear(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            System.out.println(a + " - високосный год");

        } else {
            System.out.println(a + " - не високосный год");
        }

    }

    public static void checkOS(String os, int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (os.equals("IOS")) {
            System.out.println("IOS");
        } else {
            System.out.println("Android");
        }
        if (currentYear < deviceYear) {
            System.out.println("Установите lite-версию для " + os);
        } else {
            System.out.println("Установите обычную версию для " + os);
        }
    }

    public static void deliveryDaysCounter() {
        int daysCounter = 1;
        int deliveryDistance = 5;
        if (deliveryDistance > 20) {
            daysCounter++;
        }
        if (deliveryDistance > 60) {
            daysCounter++;
        }
        if (deliveryDistance > 100) {
            System.out.println("На это расстояние мы не доставляем");
        }
        System.out.println("Потребуется дней: " + daysCounter);
    }

}
