package by.epam.learn.tasks;
import java.util.Arrays;

public class TasksArray {

    public static void task1() {
        System.out.println("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");
        // создадим массив из натуральных чисел
        int[] myArray = new int []{1,2,3,4,5,6,7,8,9,10};
        // вводим число которое дожно быть кратно натуральному числу
        int k = Tasks.scannerInteger();
        int result = 0;
        for ( int i = 0; i < myArray.length ; i++) {
            if ( myArray[i] % k == 0) {
                result = result + myArray[i];
            }
        }
        System.out.println(result);
    }

    public static void task2() {
        System.out.println("2. Дана последовательность действительных чисел а1 ,а2 ,..., аn. Заменить все ее члены, большие данного Z, этим\n" +
                "числом. Подсчитать количество замен.");
        // вводим число которое дожно быть меньше z
        double z = Tasks.scannerDouble();
        // последовательность действительных чисел а1 ,а2 ,..., аn.
        double[] myArray = new double[]{1,2,3,5,6.77,8.76,-4.23,1.21,-2.3,5} ;

        // количество замен
        int count = 0;
        for ( int i = 0; i < myArray.length ; i++) {
            if ( myArray[i] > z ) {
                myArray[i] = z;
                count ++;
            }
        }
        String arrayString = Arrays.toString(myArray);
        System.out.println(arrayString);
        System.out.println("Количество замен равно:"+count);
    }

    public static void task3() {
        System.out.println("3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,\n" +
                "положительных и нулевых элементов.\n");
        // последовательность действительных чисел а1 ,а2 ,..., аn.
        double[] myArray = new double[]{1,2,3,5,6.77,8.76,-4.23,1.21,-2.3,5,0,0} ;

        // количество отрицательных, положительных и нулевых элементов.
        int countPos = 0;
        int countNeg = 0;
        int countZero = 0;
        for ( int i = 0; i < myArray.length ; i++) {
            if ( myArray[i] > 0 ) {
                countPos ++;
            } else if ( myArray[i] < 0) {
                countNeg ++;
            } else {
                countZero ++;
            }
        }
        String arrayString = Arrays.toString(myArray);
        System.out.println(arrayString);
        System.out.println("В массиве количество пол. чисел равно: "+countPos+" отрицательных: " +countNeg+" и равно нулю: " +countZero);
    }

    public static void task4() {
        System.out.println("4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.");
        // последовательность действительных чисел а1 ,а2 ,..., аn.
        double[] myArray = new double[]{8.76,2,3,5,6.77,7.1,4.5,1.21,-2.3,5,0,-4.23};

        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > myArray[indexOfMax]) {
                indexOfMax = i;
            } else if (myArray[i] < myArray[indexOfMin]) {
                indexOfMin = i;
            }
        }
        // для того что бы поменять местами элементы масива ввел временную переменную
        double tempVar = myArray[indexOfMax];
        myArray[indexOfMax] = myArray[indexOfMin];
        myArray[indexOfMin] = tempVar;
        String arrayString = Arrays.toString(myArray);
        System.out.println(arrayString);
    }

    public static void task5() {
        System.out.println("5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.");
        // Даны целые числа а1 ,а2 ,..., аn
        int[] myArray = new int[]{1,2,3,4,5,6,7,8,9,10};
        // вводим чило "i" для которых аi > i
        int i = Tasks.scannerInteger();
        for (int j = 0; j < myArray.length; j++) {
            if ( myArray[j] > i ) {
                System.out.println(myArray[j]);
            }
        }
    }
    public static void task6() {
        System.out.println("6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых\n" +
                "являются простыми числами.");
        //Задана последовательность N вещественных чисел.
        double[] myArray = new double[]{ 2.3333333,3.22222222,5.1234,6.777777,7.1111111,1.213456,-2.33333333,5.12345};
        // создадим массив для определения простых чисел для порядковых номеров
        int [] myArrayPrimeNum = new int[myArray.length];
        // счётчик для определения простых чисел
        int count = 0;
        double result =0;

        for (int i = 1; i < myArray.length; i++) {
            for (int j = 1 ; j < myArrayPrimeNum.length ; j++) {
               // определяем количество делителей у порядкового номера числа которое делиться без остатка
               if ( i % j == 0) {
                   count++;
                   myArrayPrimeNum[i] = count;
               }
            }
            // обнуляем переменную после каждого элемента массива
            count = 0;
        }
        // Вычисляем сумму чисел, порядковые номера которых являются простыми числами.
        for (int i = 1; i < myArrayPrimeNum.length; i++) {
            if (myArrayPrimeNum[i] == 2){
                result = result + myArray[i];
            }
        }
        System.out.println(result);
    }

    public static void task7() {
        System.out.println("7. Даны действительные числа  (a1, a2,... an). Найти max( a1 + a2n, a2 + a2n−1,..., an + an+1)");
        double[] array = new double[]{ 2.3333333,3.22222222,5.1234,6.777777,7.1111111,1.213456,-2.33333333,5.12345};
        //int[] array = new int []{1,2};
        double maxSum = array[0] + array[array.length - 1];
        for (int i = 0; i < array.length / 2; i++) {
            double elementArr = array[i] + array[array.length - i - 1];
            if (elementArr > maxSum) {
                maxSum = array[i] + elementArr;
            }
        }
        System.out.println("Максимальное число из последовательности равно :" + maxSum);
    }

    public static void task8() {
        System.out.println("8. Дана последовательность целых чисел (a1, a2,... an) . Образовать новую последовательность, выбросив из\n" +
                "исходной те члены, которые равны min( a1 , a2,.. ,an  ) ");
        int[] array = new int []{6,5,4,3,3,3};
        int minCount = 0;
        int min = array[0];
        // опеределяем минимальный элемент в исходном массиве
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }
        // опеределяем сколько имеется одинаковых минимальных элементов массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                minCount++;
            }
        }
        // создаём новый массив без минимальных элементов
        int[] result = new int[array.length - minCount];
        int indexResult = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        String arrayString = Arrays.toString(result);
        System.out.println(arrayString);
    }

    public static void task9() {
        System.out.println("9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких\n" +
                "чисел несколько, то определить наименьшее из них.\n");
        /*
        TODO нужно доделать когда повторяющиеся элементы отсутствуют в массиве
         */
        int[] array = new int []{3,3,7,7,7,8,8,8,1,6,5,4,1};
       // int[] array = new int []{1,2,3,4,5,7};
        // массив для определения наиболее встречающих чисел
        int[] arrayForFreq = new int [array.length];

        int result = 0;
        int count = 0;
        String arrayString3 = Arrays.toString(array);
        System.out.println("исходный массив: "+arrayString3);

        // опеределяем наиболее часто встречающееся число
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++ ){
                if ( array[i] == array[j] ) {
                    count++;
                    arrayForFreq[i] = count;
                }
            }
            // обнуляем переменную после  каждого шага цикла
            count = 0;
        }
        int countElemOne = 0;
        // определяем количество елементов которые встречаются 1 раз для построения соответствующего массива
        for ( int i = 0 ; i < arrayForFreq.length ; i++ ) {
            if (arrayForFreq[i] == 1){
                countElemOne ++;
            }
        }
        //String arrayString = Arrays.toString(arrayForFreq);
        //System.out.println(arrayString);
        //System.out.println(countElemOne);

        int counter = 0;
        // массив для определения минимального числа из наиболее часто встречающихся без единажды встречающихся елементов
        int[] arrayForFreqMin = new int [array.length - countElemOne];
        // заносим в массив наиболее часто встречающиеся числа
        for (int i = 0; i < arrayForFreq.length; i++ ) {
            if (arrayForFreq[i] > 1) {
                arrayForFreqMin[counter] = array[i];
                counter++;
            }
        }
        //String arrayString2 = Arrays.toString(arrayForFreqMinEnd);
        //System.out.println(arrayString2);

        //определяем  минимальный из наиболее встечающихся элементов
        for (int i = 0; i < arrayForFreqMin.length; i++) {
            if (arrayForFreqMin[i] <= arrayForFreqMin[0]){
                result = arrayForFreqMin[i];
            }
        }
        System.out.println(result);
    }

}
