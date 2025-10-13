package HomeWorkBlock1;

public class Main {
    public static void main(String[] args) {
        // Задача 1:
        //Создать программу, которая будет выводиться в консоль вашего имени и семьи
        calculateTask1();
        //Задача 2:
        //Добавить в программу целочисленную переменную с названием возраст, в котором будет
        //сохранить свой возраст. Выведите в консоли свое имя, фамилию и возраст
        calculateTask2();
    }

    public static void calculateTask1() {
        System.out.println("Иван Иванов");
    }

    public static void calculateTask2() {
        int age;
        age = 36;
        System.out.println("Иван Иванов " + age);
    }
}