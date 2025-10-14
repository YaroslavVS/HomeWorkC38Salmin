package HomeWork3;
import java.util.Scanner;
public class Lesson3_B1 {
    public static void main(String[] args) {

        System.out.println("________________________");
        System.out.println("Урок3, Блок1, Задача 1:");
        task1();
        System.out.println("________________________");
        System.out.println("________________________");
        System.out.println("Урок3, Блок1, Задача 2:");
        task2();
        System.out.println("________________________");
//        System.out.println("Урок3, Блок1, Задача 2_1:");
//        task2_1();
//        System.out.println("________________________");
        System.out.println("________________________");
        System.out.println("Урок3, Блок1, Задача 3:");
        task3();
        System.out.println("________________________");

    }

//    Задача 1:
//    Ввести в консоли любое число от 1 до 12. В зависимости от введенного числа вывести в
//    Консоль соответствует пору года по номеру месяца. При возможности использовать
//    switch

    public static void task1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ввести любое число от 1 до 12: ");
        int monthNumber = input.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.println("Весна");
                break;
            case 4:
                System.out.println("Весна");
                break;
            case 5:
                System.out.println("Весна");
                break;
            case 6:
                System.out.println("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.println("Осень");
                break;
            case 10:
                System.out.println("Осень");
                break;
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
                System.out.println("Месяца с таким номером не существует!");
        }
    }

//    Задача 2:
//    используйте while пока выводите все числа от 0 до 25 в одну строку через пробел

    public static void task2() {
        int i = 0;
        while (i<=25) {
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();
    }
//    public static void task2_1() {
//        int i = 0;
//        do {
//            System.out.print(i+ " ");
//            i++;
//        } while (i<=25);
//
//        System.out.println();
//    }

//    Задача 3:
//    Используя for вывести каждое четное число от 2 до 20 включительно и больше 10.

    public static void task3() {
        for (int i = 2 ; i<=20 ; i+=2) {
            if (i>10) System.out.print(i + " ");
        }
        System.out.println();
    }

}
