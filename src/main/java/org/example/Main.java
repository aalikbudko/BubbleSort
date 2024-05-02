package org.example;

public class Main {
    public static void main(String[] args) {
        int[] array = {29, 25, 3, 49, 9, 37, 21, 43};
        BucketSort sorter = new BucketSort();
        System.out.println("Исходный массив:");
        printArray(array);
        sorter.bucketSort(array);
        System.out.println("Отсортированный массив:");
        printArray(array);
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}