package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {45, 12, 60, 21, 76, 84, 34, 10};
        for (int i = 0; i < arr.length; i++) { //вывод неотсортированного массива
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n-------------------------------------------------");
        //сортировка пузырьком
        //принцип работы: начиная с первого элемента двигаемся по массиву и сравниваем его с следующим элементом, если он больше, то меняем их местами, продолжаем так до того момента
        //пока он не окажется в конце массива или не будет меньше следующего
        for (int i = 0; i < arr.length - 1; i++) { //двигаемся по всем элементам массива
            for (int j = 0; j < arr.length - i - 1; j++) { //двигаемся по всем кроме отсортированных (за счет arr1.length - i - 1), например после первой итерации самый большой элемент уже будет в нужной позиции, значит не нужно сравнивать с ним предыдущие элементы
                if (arr[j] > arr[j + 1]) { //если элемент больше следующего
                    int temp = arr[j];      //то меняем их местами
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) { //вывод отсортированного массива
            System.out.print(arr[i] + " ");
        }
    }
}