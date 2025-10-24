package HomeWork3;
import java.util.Scanner;
public class Lesson3_B2 {
    public static void main(String[] args) {
        System.out.println("________________________");
        System.out.println("Урок3, Блок2, Задача 1:");
        task1();
        System.out.println("________________________");
        System.out.println("Урок3, Блок2, Задача 2:");
        task2();
        System.out.println("________________________");
        System.out.println("Урок3, Блок2, Задача 3:");
        task3();
        System.out.println("________________________");
        System.out.println("Урок3, Блок2, Задача 4:");
        task4();
        System.out.println("________________________");
        System.out.println("Урок3, Блок2, Задача *:");
//        taskStar();
//        System.out.println("________________________");
        taskStar1();
        System.out.println("________________________");
//        taskStar2();
//        System.out.println("________________________");
    }

//        Задача 1:
//        Напишите программу, которая будет принимать входное число из консоли и на выходе
//        будет выведено сообщение четное число или нет. Для определения четности чисел
//        Получение остатка от деления (операция выглядит так: '% 2)

    public static void task1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = input.nextInt();
        if (x%2==0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число не четное");
        }
    }

//    Задача 2:
//    Для введенного числа t (температуры на улице) вывести: Если t>–5, вывести «Warm».
//    Если –5>= t > –20, вывести «Normal». Если –20>= t, вывести «Cold».

    public static void task2() {
        Scanner imput = new Scanner(System.in);
        System.out.print("Введите температуру улицы:");
        int t = imput.nextInt();
        if (t>-5) {
            System.out.println("Warm");
            } else if (t>-20) {
            System.out.println("Normal");
                } else {
                    System.out.println("Cold");
                }
    }

//    Задача 3:
//    Составьте программу, выводящую на экран квадраты чисел от 10 до 20 последовательно

    public static void task3() {
        for (int i=10 ; i<=20 ; i++) {
            System.out.println((i * i) + " ");
        }
    }

//    Задача 4:
//    Необходимо, чтобы программа выводила на экран вот такую последовательность:
//    7 14 21 28 35 42 49 56 63 70 77 84 91 98. В решении используйте цикл while.

    public static void task4() {
        int i = 7;
        while (i<=98) {
            System.out.print(i + " ");
            i+=7;
        }
        System.out.println();
    }

//    Задача *:
//    Напишите программу, где пользователь вводит любое целое положительное число. А
//    программа суммирует все числа от 1 до введенного пользователем числа. Для ввода
//    числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог
//    ввести некорректные данные.

//    public static void taskStar() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = input.nextInt();
//        if (number > 0) {
//            int sum = number * (number + 1) / 2;
//            System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
//        } else {
//            System.out.println("Введены некорректные данные");
//        }
//    }
    public static void taskStar1() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = input.nextInt();
        if (number > 0) {
            int sum = 0;
            for (int i = 1; i <= number; i++){
                sum = sum + i;
            }
            System.out.println("Сумма чисел от 1 до " + number + " = " + sum);
        } else {
            System.out.println("Введены некорректные данные");
        }
    }
//    public static void taskStar2() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Введите число: ");
//        int number = input.nextInt();
//        if (number > 0) {
//            int p = 1;
//            for (int i = 1; i <= number; i++){
//                p = p * i;
//            }
//            System.out.println("Произведение чисел от 1 до " + number + " = " + p);
//        } else {
//            System.out.println("Введены некорректные данные");
//        }
//    }
}