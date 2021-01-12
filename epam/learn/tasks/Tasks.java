package by.epam.learn.tasks;

import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Tasks {



    public static int scannerInteger(){
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Введите число: ");

        while ( !scan.hasNextInt() ) {
            scan.next();
            System.out.println("Некорректный ввод!");
            System.out.print("Введите число: ");
        }
        number = scan.nextInt();
        return number;
    }

    public static double scannerDouble(){
        Scanner scan = new Scanner(System.in);
        double number;
        System.out.print("Введите число: ");

        while ( !scan.hasNextDouble() ) {
            scan.next();
            System.out.println("Некорректный ввод!");
            System.out.print("Введите число: ");
        }
        number = scan.nextDouble();
        return number;
    }

    public static int getCountsOfDigits(long number) {
        int count = (number == 0) ? 1 : 0;
        while (number != 0) {
            count++;
            number = number / 10;
        }
        return count;
    }


    public static void task01(){
        System.out.println("1. Найдите значение функции:  z = ( (a – 3 ) * b / 2) + c.");
        double z;
        double a = scannerDouble();
        double b = scannerDouble();
        double c = scannerDouble();
        z = ((a - 3) * b / 2.0) + c;
        System.out.println("z = " + z);
    }

    public static void task2() {
        System.out.println("2. Вычислить значение выражени:  (b + Math.sqrt(b*b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2)");
        double result;
        double a = scannerDouble();
        double b = scannerDouble();
        double c = scannerDouble();
        result = (b + Math.sqrt(b*b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение выражения равно " + result);
        System.out.println();

    }

    public static void task3(){
        System.out.println("3. Вычислить значение выражения по формуле (все переменные принимают действительные значения) ");
        System.out.println("3. Введите значени x и y в градусах  0 - 360 ");
        // значения в градусах
        double x = scannerDouble();;
        double y = scannerDouble();;

        //перевод в радианы
        double xRad = x * Math.PI / 180.0;
        double yRad = y * Math.PI / 180.0;
        System.out.println("x в радианах равно: " + xRad);
        System.out.println("y в радианах равно: " + yRad);
        double result = (Math.sin(xRad) + Math.cos(yRad)) / (Math.cos(xRad) - Math.sin(yRad)) * Math.tan(xRad * yRad);

        System.out.println("Значение выражения равно " + result);
    }

    public static void task4() {
        System.out.println("4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). " +
                "Поменять местами дробную и целую части числа и вывести полученное значение числа. ");

        double r = scannerDouble();

        int firstPart = (int) r;

        int secondPart = (int)((r - firstPart) * 1000);
        double result = secondPart + firstPart * 0.001;

        System.out.println("Исходное число " + r);
        System.out.println("Полученное число " + result);
        System.out.println();


    }

    public static void task5(){
        System.out.println("5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. " +
                "Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc. ");

        int x = scannerInteger();

        int hours = (x / 3600);
        int remainderMinutes = (x % 3600);
        int minutes = (remainderMinutes / 60);
        int seconds = (remainderMinutes % 60);

        System.out.println(hours + " ч. " + minutes + " мин. " + seconds + " c.");

    }

    public static void task6() {
        System.out.println("6. Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у) принадлежит закрашенной области, и false — в противном случае");
        double x = scannerDouble();
        double y = scannerDouble();
        // должно выполняться 1-но из 2-ух условий :
        // для отрицательных "y" (y >= -3 && y <= 0 && x >= -4 && x <= 4)
        // для положительных "y" (y >= 0 && y <= 4  && x >= -2 && x <= 2)
        if (y >= -3 && y <= 0 && x >= -4 && x <= 4 || y >= 0 && y <= 4  && x >= -2 && x <= 2) {
            System.out.println("true");
            //System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
        } else {
            System.out.println("false");
           //System.out.println("Точка с координатами (" + x + ", " + y + ") не принадлежит закрашенной области");
        }

    }

    public static void task7() {
        System.out.println("7.  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.");
        double x = scannerDouble();
        double y = scannerDouble();
        double z ;

        z = 180 - (x + y);

        if ( z > 0 ) {
            System.out.println("Такой треугольник существует");
            if ( z == 90 || x == 90 || y == 90 ) {
                System.out.println("Треугольник прямоугольный");
            } else {
                System.out.println("Треугольник не является прямоугольный");
            }
        } else {
            System.out.println(" Такой треугольник  не существует ");
        }
    }

    public static void task8() {
        System.out.println("8.  Найти max{min(a, b), min(c, d)}");
        double a = scannerDouble();
        double b = scannerDouble();
        double c = scannerDouble();;
        double d = scannerDouble();

        double[] arr= { Math.min(a, b), Math.min(c, d) };
        double maxValueArr = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > maxValueArr){
                maxValueArr =  arr[i];
            }
        }
        System.out.println("Максимально число равно :" + maxValueArr );
    }


    public static void task9() {
        System.out.println("9. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.");
        double x1 = scannerDouble();
        double y1 = scannerDouble();
        double x2 = scannerDouble();
        double y2 = scannerDouble();
        double x3 = scannerDouble();
        double y3 = scannerDouble();
        // Должно выполнятся следующее равенства для 3 ёх точек
        // (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)
        // так как значения (x2 - x1) и (y2 - y1) могут принимать значения равное "0" преобразуем наше уравнение
        if ((y3 - y1) * (x2 - x1) == (x3 - x1) * (y2 - y1)) {
            System.out.println("точки расположены на  одной прямой");
        } else {
            System.out.println("точки не расположены на  одной прямой");

        }

    }

    public static void task10() {
        System.out.println("10. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.");
        double a = scannerDouble();
        double b = scannerDouble();
        double x = scannerDouble();
        double y = scannerDouble();
        double z = scannerDouble();

        if (a > x && b > z) {
            System.out.println("Кирпич пройдёт");
        } else {
            System.out.println("Кирпич не пройдёт");
        }

    }

    public static void task11() {
        System.out.println("11.  Вычислить значение функции:");

        double x = scannerDouble();
        double y ;

        if (x >= 3) {
            y =  Math.pow(x, 2)  - 3 * x + 9;
        } else {
            y = 1 / (Math.pow(x, 3) + 6);
        }
        System.out.println(y);
    }


    public static void task12() {
        System.out.println("12. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа");
        int x = scannerInteger();

        if (x > 0) {
            int sum = 0;
            for (int i = 1; i <= x ; i++){
                sum = sum + i;
            }
            System.out.println("Сумма чисел от 1 до " + x +" равна: " + sum);
        } else {
            System.out.println("Введите положительное число");
            task12();
        }
    }


    public static void task13() {
        System.out.println("13. Вычислить значения функции на отрезке [а,b] c шагом h");
        int a = scannerInteger();
        int b = scannerInteger();
        int h = scannerInteger();
        int y;

        for (int i = a; i <= b; i += h) {
            if (i > 2) {
                y = i;
            } else {
                y = i * (-1);
            }
            System.out.println("При х = " + i + " у = " + y);
        }
    }

    public static void task14() {
        System.out.println("14. Найти сумму квадратов первых ста чисел.");

        int sum = 0;
        for (int i = 1; i <= 100 ; i++){
            sum = sum + i * i ;
        }
        System.out.println("Сумма квадратов первых ста чисел равна: " + sum);
    }

    public static void task15() {
        System.out.println("15. Составить программу нахождения произведения квадратов первых двухсот чисел.");

        BigInteger resultValue = new BigInteger("1");
        int firstValue;

        for (int i = 1; i <= 200 ; i++) {
            firstValue = i * i;
            resultValue =  resultValue.multiply(BigInteger.valueOf(firstValue));
        }
        System.out.println("Произведение квадратов первых двухсот чисел равна: " + resultValue);
    }

    public static void task16() {
        System.out.println("16. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых " +
                "больше или равен заданному е.");

        double sum = 0;
        double e = 0.1;
        double an = 0;
        int n = 50;

        for (int i = 0; i <= n; i++) {
            an = 1/Math.pow(2, i ) + 1/Math.pow(3, i );
            if ( Math.abs(an) >= e ){
                sum += an;
               System.out.println("Сумма равна " + sum);
            }
        }
        System.out.println("Сумма равна " + sum);
    }

    public static void task17() {
        System.out.println("17. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.");
        char a ;
       // System.out.println(a);
        for (int i = 0; i <= 127; i++) {
            a = (char)i;
            System.out.println("Числу " +i+ " соответствует символ : " + a);
        }

    }
    public static void task18() {
        System.out.println("17. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.\n" +
                "m и n вводятся с клавиатуры..");

        int m = scannerInteger();
        int n = scannerInteger();
        for (int i = m; i <= n; i++) {
            for ( int ii = 1; ii <= n; ii++ ){
                if (i % ii == 0 &&  ii != 1 && ii != i) {
                    System.out.println("Число :"+i+ " делиться на "+ii);
                }
            }
        }
        System.out.println(" в промежутке от "+m+" до "+n);
    }

    public static void task19() {
        System.out.println("19.Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.");

        int m = scannerInteger();
        int n = scannerInteger();
        int countM = getCountsOfDigits(m); // подсчёт количества цифр
        int countN = getCountsOfDigits(n); // подсчёт количества цифр

        int[] arrM = new int[countM];
        int[] arrN = new int[countN];

        for (int i = countM - 1; i >= 0 ; i--) {
            arrM[i] = m % 10;
            m = m / 10;
        }
        for (int i = countN - 1; i >= 0 ; i--) {
            arrN[i] = n % 10;
            n = n / 10;
        }

        for (int i = 0; i < countM   ; i++) {
            for (int j = 0; j < countN  ; j++) {
                if(arrM[i] == arrN[j] ) {
                    System.out.println("Цифра "+ arrM[i] + " присутствует в первом и втором числе");
                }
            }
        }

        String intArrayStringM = Arrays.toString(arrM);
        String intArrayStringN = Arrays.toString(arrN);
        System.out.println( "Первое число содержит цифры"+intArrayStringM);
        System.out.println("Второе число содержит цифры"+intArrayStringN);

    }


}
