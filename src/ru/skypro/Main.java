package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        int [] Weight = new int [3];
        Weight [0] = 1;
        Weight [1] = 2;
        Weight [2] = 3;
        double [] Fraction = {1.57, 7.654, 9.986};
        int [] Numbers = new int[5];
        Numbers [0] = 21;
        Numbers [1] = 87;
        Numbers [2] = 76;
        Numbers [3] = 57;
    }

    public static void task2 () {
        int [] Weight = new int [3];
        Weight [0] = 1;
        Weight [1] = 2;
        Weight [2] = 3;
        double [] Fraction = {1.57, 7.654, 9.986};
        int [] Numbers = new int[5];
        Numbers [0] = 21;
        Numbers [1] = 87;
        Numbers [2] = 76;
        Numbers [3] = 57;
        System.out.println(Weight[0] + ", " + Weight[1] + ", " + Weight[2]);
        System.out.println(Fraction[0] + ", " + Fraction[1] + ", " + Fraction[2]);
        System.out.println(Numbers[0] + ", " + Numbers[1] + ", " + Numbers[2] + ", " + Numbers[3] + ", " + Numbers[4]);
    }

    public static void task3 () {
        int [] Weight = new int [3];
        Weight [0] = 1;
        Weight [1] = 2;
        Weight [2] = 3;
        double [] Fraction = {1.57, 7.654, 9.986};
        int [] Numbers = new int[5];
        Numbers [0] = 21;
        Numbers [1] = 87;
        Numbers [2] = 76;
        Numbers [3] = 57;
        System.out.println(Weight[2] + ", " + Weight[1] + ", " + Weight[0]);
        System.out.println(Fraction[2] + ", " + Fraction[1] + ", " + Fraction[0]);
        System.out.println(Numbers[4] + ", " + Numbers[3] + ", " + Numbers[2] + ", " + Numbers[1] + ", " + Numbers[0]);
    }

    public static void task4 () {
        int [] Weight = new int [3];
        Weight [0] = 1;
        Weight [1] = 2;
        Weight [2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i % 2 == 0) {
                System.out.println(Weight[1]);
                // Чесно говоря, Я не понял как это сделать, можете мне тут это рассписать?
            }
        }
    }
}
