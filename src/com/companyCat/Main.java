package com.companyCat;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Lesson4_Task1();
        //Lesson4_Task2();
         HomeTask1();
        //HomeTask2();
        //HomeTask3();
        //HomeTask4();
        //HomeTask5();
        //HomeTask6();
        //HomeTask7();
        //HomeTask8();
        //HomeTask9(); //Сделано но явно с лишними шагами - вопрос можно ли было обойтись без третьего массива
        // и в А и в Б задании..

               
    }

    private static void HomeTask9() {
        // 9. Дан массив целых чисел. Удалить из него:
        //а) все четные элементы, стоящие на нечетных местах;
        //б) все элементы, кратные 3 или 5.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размерность целочисленного массива");
        int number = scanner.nextInt();
        int numberB = number;
        int countb=0;
        int counta = 0;
        int numberA = number;

        int[] Matrix0 = new int[number];

        int[] MatrixA = new int[numberA];
        int[] MatrixAi = new int[numberA];

        int[] MatrixB = new int[numberB];
        int[] MatrixBi = new int[numberB];

        for (int i = 0; i < Matrix0.length; i++) {
            Matrix0[i] = (int) (Math.random() * 1000);
            if (Matrix0[i] % 2 == 0 && i % 2 == 0) {
                numberA --;
            } else {
                MatrixA[counta] = Matrix0[i];
                counta++;
            }

            if (Matrix0[i]%3 == 0 || Matrix0[i]%5==0){
                numberB--;
            }
            else {
                MatrixB[countb]=Matrix0[i];
                countb++;
            }
        }
        System.out.println(Arrays.toString(Matrix0));
        System.out.println(Arrays.toString(MatrixA));
        System.out.println(numberA); // если count размерность MatrixA - почему  длина его массива не count
        System.out.println(MatrixA.length);
        // в упор не понимаю почему не получилось обойтись без третьего массива для удаления лишних элементов
        // не понимаю почему MatrixA и MatrixB добивается нулями..
        System.out.println("Задание а.");

        for (int i = 0; i < numberA ; i++) {
            MatrixAi[i] = MatrixA[i];
                System.out.print(MatrixAi[i]+"  ");
        }
        System.out.println(System.lineSeparator());
        System.out.println("Задание б.");
        for (int i = 0; i < numberB ; i++) {
            MatrixBi[i] = MatrixB[i];
            System.out.print(MatrixBi[i]+"  ");

        }
        //System.out.println(Arrays.toString(MatrixB));
    }

    private static void HomeTask8() {
        //Заменить нулями :
        //а) все отрицательные элементы;
        //б) все элементы, большие данного числа n;
        //в) все элементы, начиная с n1-го по n2-й (n1 ≤ n2)
        System.out.println("введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int n1, n2;
        double[] matrix0 = new double[number];
        double[] matrix1 = new double[number];
        double[] matrix2 = new double[number];
        double[] matrix3 = new double[number];

        System.out.println("задание б) введите число n - больше которого значения сделать =0");
        double n = scanner.nextDouble();
        System.out.println("задание в) введите номера элементов n1 и n2 (n1<=n2)- значения в этом интервале =0");
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        System.out.println("введите значения массива (с повторяющимися значениями для теста) а потом");

        for (int i = 0; i < matrix0.length ; i++) {
            matrix0[i]= scanner.nextInt();
            if (matrix0[i]<0){
                matrix1[i]=0;
            }
            else {
                matrix1[i] = matrix0[i];
            }
            if (matrix0[i]>n){
                matrix2[i]=0;
            }
            else {
                matrix2[i]=matrix0[i];
            }
            if (i>=n1-1 && i<=n2-1) {
                matrix3[i] = 0;
            }
            else {
                matrix3[i]=matrix0[i];
            }
        }

        System.out.println(Arrays.toString(matrix0));
        System.out.println("а) все отрицательные значения заменены на 0:  "+Arrays.toString(matrix1));
        System.out.println("б) все значения больше "+n+" заменены на 0: "+Arrays.toString(matrix2));
        System.out.println("с) значения =0 у номеров элементов от "+n1 +" по "+n2+(Arrays.toString(matrix3)) );
        }


    private static void HomeTask7() {
        //7. Заменить нулями все повторяющиеся элементы в массиве,
        // оставив их первые вхождения, то есть в массиве должны остаться только разные элементы.
        System.out.println("введите размерность массива");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] massiv = new int[n];
        System.out.println("введите значения массива с повторяющимися значениями для теста");
        for (int i = 0; i < massiv.length ; i++) {
            massiv[i]= scanner.nextInt();
            }
        System.out.println(Arrays.toString(massiv));
        for (int j = 0; j < massiv.length; j++) {
            for (int k = j+1; k < massiv.length; k++) {
                if (massiv [j] == massiv[k]){
                    massiv[k]=0;
                }
                }
        }
        System.out.println(Arrays.toString(massiv));
    }

    private static void HomeTask6() {
        //6. Дан массив, в котором все элементы различны. Заменить в нём нулём :
        //а) максимальный элемент;
        //б) минимальный элемент.
        int N = (int)((Math.random()*100+10)/10.);
        int max =0, min =100000000;
        int maxi = 0, mini =0;
        int reverse;
        System.out.println("массив размерности - "+N);
        int[] massiv = new int[N];
        massiv[0] = (int) ((Math.random() * 1000 + 10) / 10.);

        for (int i = 1; i < massiv.length; i++) {
            massiv[i] = (int) ((Math.random() * 1000 + 10) / 10.);
            if (massiv[i] == massiv[i-1]){
                massiv[i-1] = (int) ((Math.random() * 1000*i + 10) / 10.);
            }
        }
        System.out.println("массив неповторяющихся цифр               "+Arrays.toString(massiv));

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]>max){
                max = massiv[i];
                maxi = i;
            }
        }
        reverse = massiv[maxi];
        massiv[maxi]=0;
        System.out.println("Вариант А - макс заменить на 0            "+Arrays.toString(massiv));
        massiv[maxi]=reverse;
        System.out.println("Вариант А - проверка что число вернулось  "+Arrays.toString(massiv));

        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i]<min){
                min = massiv[i];
                mini = i;
            }
        }
        reverse = massiv[mini];
        massiv[mini]=0;
        System.out.println("Вариант Б - мин заменить на 0             "+Arrays.toString(massiv));
        massiv[mini]=reverse;
        System.out.println("Возврат массива в первоначальнай вид)))   "+Arrays.toString(massiv));
    }

    private static void HomeTask5() {
        //5. Задан целочисленный массив размерности N.
        // Есть ли среди элементов массива простые числа? Если да, то вывести номера этих элементов.
        int N = (int)((Math.random()*100+10)/10.);
        int number =0;
        System.out.println("массив размерности - "+N);
        int[] massiv = new int[N];

        for (int i = 0; i < massiv.length; i++) {
            massiv[i]= (int)((Math.random()*1000+10)/10.);

            for (int j = 1; j <= massiv[i] ; j++) {
                if (massiv[i] % j == 0){
                    number++;
                }
            }
            if ( number <= 2) {
                System.out.println("простое число - " + massiv[i] + " его порядковый номер = " + (i+1));
            }
            number = 0;
        }
        System.out.println(Arrays.toString(massiv));
    }

    private static void HomeTask4() {
        //Написать программу определения в одномерном массиве вещественных чисел наибольшего
        // количества последовательно расположенных положительных чисел.
        int index;
        int count=0, max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива вещественных чисел");
        index = scanner.nextInt();
        double[] number = new double[index];
        Arrays.fill(number, Math.random());

        for (int i = 0;i < number.length; i +=(int)(Math.random()*10) ) {
            number[i] = Math.random() * -1;
        }

        for (int j = 0; j < number.length; j++) {
            if (number[j] > 0) count++;
            else count=0;

            if (count > max) {
                max = count;
            }
        }
            System.out.println(Arrays.toString(number));
            System.out.println("наибольшее количество последовательно расположенных положительных чисел = "+max);
     }

    private static void HomeTask3() {
        //3. Оценки, полученные спортсменом в соревнованиях по фигурному катанию (в баллах),
        // хранятся в массиве из 18 элементов. В первых шести элементах записаны оценки по обязательной программе,
        // с седьмого по двенадцатый — по короткой программе, в остальных — по произвольной программе.
        // Выяснить, по какому виду программы спортсмен показал лучший результат
        int bal = 18;
        int one = 0, two = 0, three = 0;
        int limit = 6;
        int[] sportsmen = new int[bal];

        for (int i = 0; i < sportsmen.length; i++) {
            sportsmen[i] = (int) (Math.random() * 10);
        }
        for (int j = 0; j <= limit - 1; j++) {
            one += sportsmen[j];
        }
        for (int k = limit; k >= limit && k <= limit + limit - 1; k++) {
            two += sportsmen[k];

        }
        for (int l = limit + limit; l >= limit + limit && l < sportsmen.length; l++) {
            three += sportsmen[l];
        }
        System.out.println(Arrays.toString(sportsmen));
        System.out.println(one + "    " + two + "   " + three);
        System.out.println("лучший результат в  " + (one > two ? one > three ? "обязательной " : "произвольной " : "короткой ")
                + " программе");
    }


    private static void HomeTask2() {
        //2.В массиве хранится информация о баллах, полученных спортсменом-десятиборцем
        // в каждом из десяти видов спорта. Для выхода в следующий этап соревнований
        // общая сумма баллов должна превысить некоторое известное значение. Определить,
        // вышел ли данный спортсмен в следующий этап соревнований.
        int sport = 10, balSum =0;
        int[] sportsmen = new int[sport];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите пороговое количество баллов");
        int bal = scanner.nextInt();

        for (int i = 0; i < sportsmen.length; i++) {
            sportsmen[i] = (int)(Math.random()*10);
            balSum += sportsmen[i];
        }
        System.out.println("Все баллы спортсмена детально "+Arrays.toString(sportsmen));
        System.out.println("Сумма набранных баллов спортсмена = "+balSum);
        System.out.println((balSum > bal? "Спортсмен молодец - преодолел порог!!!": "спортсмен недобрал "+ (bal-balSum)
        + " баллов(((((( "));
    }

    private static void HomeTask1() {
        //1. В массиве хранится информация о численности книг в
        // каждом из 35 разделов библиотеки. Выяснить, верно ли, что общее
        // число книг в библиотеке есть шестизначное число.

        int librCat = 35, count=0, count0 = 6;
        double librAll=0;
        double number=1;
        int[] Libr = new int[librCat];


     for   ( int i = 0; i < Libr.length ; i++)
        {
            Libr[i] = ((int)(Math.random()*10000/10.));
            librAll += Libr[i];
        }
     for (int j = 1; number>=1;j *= 10){
         number = librAll/j;
         count++;

     }
        System.out.println(Arrays.toString(Libr));
     System.out.println("Всего книг в библиотеке: "+(int)librAll+ ". И это число "+ (count-1 == count0? "шестизначное ":
             " имеет "+ (count-1)+" знаков"));

    }
    private static void Lesson4_Task2() {
        //7. На соревнованиях по прыжкам в высоту и в длину получены два массива
        //результатов H(n) и D(n). Определить три лучших и три худших результата
        //в каждом виде соревнований.

        int n = 25;
        int min = 3;
        double[] minH = new double[min];
        double[] maxH = new double[min];
        double[] minL = new double[min];
        double[] maxL = new double[min];


        double[] Hight = new double[n];
        double[] Long = new double[n];


        for (int j = 0; j < Hight.length; j++) {
            Long[j] = ((int) (Math.random() * 101)) / 10.;
            Hight[j] = ((int) (Math.random() * 101)) / 10.;
        }
        System.out.println("Все результаты прыжков в высоту и в длину");
        System.out.println(Arrays.toString(Hight));
        System.out.println(Arrays.toString(Long));

        Arrays.sort(Hight);
        Arrays.sort(Long);

        System.out.println("ОТсортированные результаты прыжков в высоту и в длину");
        System.out.println(Arrays.toString(Hight));
        System.out.println(Arrays.toString(Long));

        for (int i = 0; i < maxH.length; i++) {

                minL[i] = Long[i];
                minH[i] = Hight[i];
            }

        for (int j = Hight.length-1; j > Hight.length- maxL.length-1; j--) {

            maxL[Hight.length-j-1] = Long[j];
            maxH[Hight.length-j-1] = Hight[j];
        }
        System.out.println("Худшие результаты прыжков в высоту и в длину");
        System.out.println(Arrays.toString(minH));
        System.out.println(Arrays.toString(minL));
        System.out.println("Лучшие результаты прыжков в высоту и в длину");
        System.out.println(Arrays.toString(maxH));
        System.out.println(Arrays.toString(maxL));
    }

    private static void Lesson4_Task1() {

        /*6. Руководство фирмы ведет по месяцам учет расходов и поступлений
        средств. За n месяцев получены два массива: R(n) — расходов и P(n) —
        поступлений. Сформировать из массивов R(n) и P(n) массив прибыли Z(n).
                Определить общую прибыль (как за весь период, так и по месяцам она
        может быть отрицательная), месяц с максимальной и месяц с минимальной
        прибылью, количество месяцев с положительной прибылью.
        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол месяцев для анализа деятельности предприятия");
        int Mes = scanner.nextInt();
        double ZMax = -1000000000;   //  в реальной экономической модели аккуратно задавать начальные
        // значения = можно промахнуться
        double ZMin = 1000000000;
        int imax= 0,imin = 0;
        double[] R = new double[Mes];
        double[] P = new double[Mes];
        double[] Z = new double[Mes];

        double ZSum =0;
        //System.out.println("Прибыль по месяцам = ");

        System.out.print("Месяцы               ");
        for (int i = 0; i < Z.length; i++) {
            System.out.print((i+1)+"      ");
            R[i] = ((int)(Math.random() * 10000))/100.;
            P[i] = ((int)(Math.random() * 15000))/100.;
            Z[i] = (int) (P[i] - R[i]);
            ZSum += Z[i];
            if (ZMin > Z[i]) {
                ZMin=Z[i];
                imin = i+1;
            }
            if (ZMax < Z[i]) {
                ZMax=Z[i];
                imax = i+1;
            }
        }
        System.out.println();
        System.out.println("Прибыль по месяцам = " + Arrays.toString(Z));
        System.out.println("Доход по месяцам =   " + Arrays.toString(P));
        System.out.println("Расход по месяцам =  " + Arrays.toString(R));
        System.out.println("Прибыль за = " + Mes + " мес. составит "+ZSum);
        System.out.println("Минимальная прибыль в "+imin+ " мес. и составляет "+ ZMin);
        System.out.println("Максимальная прибыль в "+imax+ " мес. и составляет "+ ZMax);
    }
}
