package com.gmail.com;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*1. Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета
нечетных цифр в нем.*/
        int[] array = { 0, 5, 2, 4, 7, 1, 3, 19 };
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array [i] % 2 == 0) {
                sum += array [i];
            }
        }
        System.out.println("Количество нечетных цыфр = " + sum);

        /*Написать код для возможности создания массива целых чисел (размер
вводиться с клавиатуры) и возможности заполнения каждого его элемента
вручную. Выведите этот массив на экран.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Ведите длину массива");
        int size = sc.nextInt();

        int [] ar = new int [size];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("ВВедите номер");
            ar [i] = sc.nextInt();
        }
        System.out.println("Ваш массив: " + Arrays.toString(ar));

        /*Создать массив случайных чисел (размером 15 элементов). Создайте
второй массив в два раза больше, первые 15 элементов должны быть
равны элементам первого массива, а остальные элементы заполнить
удвоенных значением начальных. Например
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}*/

        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (10 + Math.random() * 10);
        }

        int[] b = Arrays.copyOf(a,  30);
        for (int j = 0; j < a.length; j++) {
            b[j + 15] = a[j] * 2;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


        /*Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b' в этой строке, с выводом
результат на экран.*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите пожалуйста текст: ");
        String text = scr.nextLine();

        char [] t = text.toCharArray();
        int bi = 0;
        for (int i = 0; i < t.length; i++){
            if (t[i] == 'b'){
                bi++;
            }
        }

        System.out.println("В этом тексте " +bi+ " букв 'b'");
    }
}
