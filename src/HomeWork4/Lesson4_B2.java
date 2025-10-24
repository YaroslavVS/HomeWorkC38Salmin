package HomeWork4;

import java.util.Arrays;
import java.util.Scanner;

public class Lesson4_B2 {
    public static void main(String[] args) {
        System.out.println("-".repeat(50));
        System.out.println("Урок 4, Блок 2, Задача 1");
        task1();
        System.out.println("-".repeat(50));
        taskStar();
        System.out.println("-".repeat(50));
    }

        //    Для всех задач исходные условия следующие: пользователь с клавиатурой вводит размер
        //    массива (просто целое число). После того, как размер массива задан, заполнить его
        //    одним из двух способов: с помощью Math.random(), или каждый элемент массива вводится
        //    вручную. Попробовать оба варианта. После заполнения массива
        //    данными, решить для него следующую задачу:

    public static void task1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        if (size < 0) {
            System.out.println("Вводимое значение не может быть отрицательным!");
            return;
        }
        int[] array = new int[size];

        //    Способ с .random
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 101) - 50;
        }

        //    Способ при помощи ввода с клавиатуры
        //        System.out.println("Введите " + size + " элементов массива:");
        //        for (int i = 0; i < size; i++) {
        //            System.out.print("Элемент [" + i + "]: ");
        //            array[i] = input.nextInt();
        //        }

        //    Задача 1:
        //    Пройдите по массиву, вывести все элементы в прямом и обратном порядке.

        //    System.out.println("Ваш массив: " + Arrays.toString(array));

        System.out.println("Прямой порядок: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("Обратный порядок: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        System.out.println("-".repeat(50));
        //    Задача 2:
        //    Найти минимальный-максимальный элемент и вывести в консоль.
        int max_ = array[0];
        int min_ = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max_) {
                max_ = array[i];
            }
            if (array[i] < min_) {
                min_ = array[i];
            }
        }
        System.out.println("Максимальный элемент: " + max_);
        System.out.println("Минимальный элемент: " + min_);
        System.out.println("-".repeat(50));

        //    Задача 3:
        //    Найти индексы минимального и максимального элементов и вывести в консоль.
        max_ = array[0];
        min_ = array[0];
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max_) {
                max_ = array[i];
                maxIndex = i;
            }
            if (array[i] < min_) {
                min_ = array[i];
                minIndex = i;
            }
        }
        System.out.println("Максимальный индекс: " + maxIndex);
        System.out.println("Минимальный индекс: " + minIndex);
        System.out.println("-".repeat(50));

//    Задача 4:
//    Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
//    сообщение, что их нет.
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Нулевых элементов нет! ");
            System.out.println("-".repeat(50));
        } else {
            System.out.println("Количество нулевых элементов: " + count);
            System.out.println("-".repeat(50));
        }

//    Задача 5:
//    Пройти по массиву и поменять местами элементы первый и последний, второй и
//    предпоследний и т.д.

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("Массив после обмена элементов: " + Arrays.toString(array));
        System.out.println("-".repeat(50));

        //    Задача 6:
//    Проверить, является ли массив возрастающей последовательностью (каждое следующее
//    число больше предыдущий).
//      Arrays.sort(array);
//      System.out.println(Arrays.toString(array));
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                System.out.println("Не является возрастающей");
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Является возрастающей");
        }
    }

    //    Задача *:
//    Имеется массив из неотрицательных чисел(любой). Представьте что массив
//    представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
//    добавить единицу к этому «числу» и на выходе получить исправленный массив. Массив не
//    содержит нуля в начале, кроме самого числа 0.
//    Пример:
//    Input: [1,4,0,5,6,3]
//    Output: [1,4,0,5,6,4]
//    Input: [9,9,9]
//    Output: [1,0,0,0]
    public static void taskStar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = input.nextInt();
        if (size < 0) {
            System.out.println("Вводимое значение не может быть отрицательным!");
            return;
        }
        int[] array = new int[size];
//            Способ с .random
        array[0] = (int) (Math.random() * 9) + 1;
        for (int i = 1; i < size; i++) {
            array[i] = (int) (Math.random() * 10);
        }
//        int[] array = new int[] {1,9,9,9,9}; test
        System.out.println("Input: " + Arrays.toString(array));
        for ( int i = array.length - 1; i > - 1; i--) {
            if (array[i] == 9) {
                array[i] = 0;
            } else {
                array[i]++;
                break;
            }
        }
        System.out.println("Output:" + Arrays.toString(array));
    }
}
