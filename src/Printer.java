//Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка содержится название жанра, а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

class Answer {
    public static void main(String[] args) {
        List<Integer> newArray = mergeSort(new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9});
        System.out.println(newArray);
    }

    public static void mergeSort(Integer[] arr) {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        int sum = 0;

        for (Integer i : arr){
            sum += i;
        }
        int avg = sum / arr.length;
        System.out.println(Arrays.toString(arr));
        System.out.printf("Minimum is %d\n", min);
        System.out.printf("Maximum is %d\n", max);
        System.out.printf("Average is = %d", avg);
    }



}


