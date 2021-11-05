/**
 *JAVA1. HomeWork_1
 *
 *@author Andrey Krikov
 *@version (04.11.2021)
 */
class HomeWork_1 {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b= -6;
        int c = a + b;
        if (c >= 0) {
            System.out.println("Summ positive");
        } else {
            System.out.println("Summ negative");
        }
    }

    public static void printColor() {
        int value = 1;
        if (value <= 0) {
            System.out.println("Red");
        } if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } if (value > 100) {
            System.out.println("Green");
        }
        System.out.println("End");
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
