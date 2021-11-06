/**
 *JAVA 1. HomeWork_2
 *
 *@author Andrey Krikov
 *@version (06.11.2021)
 */
class HomeWork_2 {
    public static void main (String[] args) {
        System.out.println(sumWithin10and20(5, -5));
        System.out.println(sumWithin10and20(2, 15));
        System.out.println(sumWithin10and20(50, 5));
        System.out.println(printNumber(0));
        System.out.println(printNumber(-3));
        System.out.println(printNegativeNumber(-8));
        System.out.println(printNegativeNumber(2));
        printWordNTimes();
        printLeapYear(2021);
        printLeapYear(2020);
    }

// 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean sumWithin10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

// 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static String printNumber(int c) {
        return "The number is " + (c >= 0? "positive" : "negative");
    }

// 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean printNegativeNumber(int f) {
        if (f < 0) {
            return true;
        } else {
            return false;
        }
    }

// 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWordNTimes() {
        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 10; j += 2) {
                System.out.print(j + "   ");
            }
            System.out.println();
        }
    }

// 5. * Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void printLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " - is a leap year");
        } else {
            System.out.println(year + " - is not a leap year");
        }
    }
}