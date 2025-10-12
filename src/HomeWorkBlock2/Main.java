package HomeWorkBlock2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        calculateTask1();
        calculateTask2();
        calculateTask3();
        calculateTask4();

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
        System.out.println("Введите вещественное число: ");
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
}

