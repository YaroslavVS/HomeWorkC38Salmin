package HomeWorkBlock2;
import java.util.Scanner;
public class Block2 {
    public static void main(String[] args) {
        //Задача 1:
        //Напишите приложение, которое будет рассчитывать и выведите значение по формуле:
        //а=4*(b+c-1)/2; b и c задаем в коде самостоятельно.
        System.out.println("________________________");
        System.out.println("Урок1, Блок2, Задача 1:");
        calculateTask1();
        System.out.println("________________________");
        //Задача 2:
        //В переменной n сохраняется двузначное число. разработать программу, резервную и
        //выводящую на экран цифру n. Например: n =26, в результате мы должны получить 8
        //(2+6).
        System.out.println("Урок1, Блок2, Задача 2:");
        calculateTask2();
        System.out.println("________________________");
        //Задача 3:
        //В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
        //выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
        //9 (1+2+6).
        System.out.println("Урок1, Блок2, Задача 3:");
        calculateTask3();
        System.out.println("________________________");
        //Задача 4:
        //В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
        //программу, округляющую число n до ближайшего целого и выводящую результат на
        //экран.
        System.out.println("Урок1, Блок2, Задача 4:");
        calculateTask4();
        System.out.println("________________________");
        //Задача 5:
        //В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую
        //на экран результат деления q на w с остатком. Пример вывода программы (для случая,
        //когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке.
        System.out.println("Урок1, Блок2, Задача 5:");
        calculateTask5();
        System.out.println("________________________");
        //Задача *:
        //Написать программу которая будет менять местами значение целочисленных
        //переменных. Пример:
        //int a = 1; int b = 2;
        //код (ваше решение)
        //sout(a); //выведет 2
        //sout(b); //выведет 1
        //Усовершенствовать программу, использовать только 2 входные переменные (a,b);
        System.out.println("Урок1, Блок2, Задача *:");
        calculateTaskStar();
        System.out.println("________________________");
        //Commit into branch1
    }

    public static void calculateTask1() {
        int b = 100;
        double c = 13;
        double a = 4 * (b + c - 1) / 2;
        System.out.println("Результат вычисления: " + a);
    }

    public static void calculateTask2() {
        int n = 26;
        int OneNumber = n / 10;
        int TwoNumber = n % 10;
        int sum = OneNumber + TwoNumber;
        System.out.println("Результат вычисления: " + sum);
    }

    public static void calculateTask3() {
        int n=126;
        int One = n / 100;
        int Two = (n / 10) % 10;
        int Three = n % 10;
        int sum1 = One+Two+Three;
        System.out.println("Результат вычисления: " + sum1);
    }

    public static void calculateTask4() {
        System.out.println("Здравствуйте, данная программа округлит ваше число");
        Scanner input = new Scanner(System.in);
        System.out.print("Введите вещественное число: ");
        double a = input.nextDouble();
        double b = a - (int)a;
        int c;
        if (b >= 0.5) {
            c = (int)a + 1 ;
        }
        else {
            c = (int) a;
        }
        System.out.println("Исходное число: " + a);
        System.out.println("Округление: " + c);
        input.close();
    }

    public static void calculateTask5() {
        int q = 21;
        int w = 8;
        int c = q / w;
        int z = q % w;
        System.out.println(q + " / " + w + " = " + c + " и " + z + " в остатке ");
    }

    public static void calculateTaskStar() {
        int a = 1; int b = 2;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}