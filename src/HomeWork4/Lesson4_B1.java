package HomeWork4;
import java.util.Arrays;
import java.util.Scanner;


public class Lesson4_B1 {
    public static void main(String[] args) {
        System.out.println("-".repeat(50));
        System.out.println("Урок 4, Блок 1, Задача 1");
        task1();
        System.out.println("-".repeat(50));
        System.out.println("Урок 4, Блок 1, Задача 2");
        task2();
        System.out.println("-".repeat(50));
        System.out.println("Урок 4, Блок 1, Задача 3");
        task3();
        System.out.println("-".repeat(50));

    }
//    Задача 1:
//Сгенерировать 5 случайных чисел. Каждое возвести в квадрат и вывести в консоль.

    public static void task1(){
        for (int i = 0; i < 5; i++) {
            double a = Math.random();
            System.out.println(a * a);
        }
    }

//    Задача 2:
//2.1 Cоздать массив fruits и наполнить его 4 произвольными фруктами.
//2.2 вывести в консоль второй и четвертый.
//2.3 вывести в консоль длину массива.
//2.4 третий фрукт заменить на иной.
//2.5 проверить результат в консоли.

    public static void task2(){
        String[] fruits;
//        fruits = new String[4];
//        fruits[0] = "Apple";
        fruits = new String[] {"Apple", "Orange", "Grape", "Banana"};
//      System.out.println("2.1 " + Arrays.toString(fruits));
        System.out.println("2.2 " + fruits[1] + " и " + fruits[3]);
        System.out.println("2.3 " + fruits.length);
        fruits[2] = "Kiwi";
        System.out.println("2.4 " + Arrays.toString(fruits));
    }

//    Задача 3:
//3.1 Создать пустой массив типа double с названием masDouble такого размера, который
//пользователь вводит с клавиатуры.
//3.2 Заполнить masDouble рандомными числами, используя Math.random() и вывести его в
//консоль.
//3.3 Каждый чётный элемент masDouble возвести в квадрат. Вывести массив в прямом и
//в обратном порядке.

    public static void task3(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = input.nextInt();
        if (size < 0) {
            System.out.println("Вводимое значение не может быть отрицательным!");
            return;
        }
        double[] masDouble;
        masDouble = new double[size];
        for (int i = 0; i < masDouble.length; i++) {
            masDouble[i] = (int) (Math.random() * 100);
        }
        System.out.println("3.2 " + Arrays.toString(masDouble));
        for (int i = 0; i < masDouble.length; i++) {
            if (masDouble[i] % 2 == 0) {
                masDouble[i] = masDouble[i] * masDouble[i] ;
            }
        }
//        System.out.println("Прямой порядок: " + Arrays.toString(masDouble));
        System.out.print("Прямой порядок: [");
        for (int i = 0; i < masDouble.length - 1; i++) {
            System.out.print(masDouble[i] + ", ");
        }
        System.out.print(masDouble[masDouble.length - 1]);
        System.out.println("]");
        System.out.print("Обратный порядок: [");
        for (int i = masDouble.length - 1; i > 0; i--) {
            System.out.print(masDouble[i] + ", ");
        }
        System.out.print(masDouble[0]);
        System.out.println("]");
    }
}
