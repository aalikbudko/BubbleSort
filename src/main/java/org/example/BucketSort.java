package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(int[] array) {
        int n = array.length;
        if (n <= 0) return;

        // Находим минимум и максимум в массиве
        int minVal = array[0];
        int maxVal = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < minVal) minVal = array[i];
            else if (array[i] > maxVal) maxVal = array[i];
        }

        // Создаем карманы
        int bucketCount = (maxVal - minVal) / n + 1;
        List<List<Integer>> buckets = new ArrayList<>(bucketCount);
        for (int i = 0; i < bucketCount; i++) {
            buckets.add(new ArrayList<>());
        }

        // Распределяем элементы по карманам
        for (int i = 0; i < n; i++) {
            int bucketIndex = (array[i] - minVal) / n;
            buckets.get(bucketIndex).add(array[i]);
        }

        // Сортируем каждый карман и объединяем их
        int index = 0;
        for (int i = 0; i < bucketCount; i++) {
            Collections.sort(buckets.get(i));
            for (int j = 0; j < buckets.get(i).size(); j++) {
                array[index++] = buckets.get(i).get(j);
            }
        }
    }
}
