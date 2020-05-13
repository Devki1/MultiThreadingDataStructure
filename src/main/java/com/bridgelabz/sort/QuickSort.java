package com.bridgelabz.sort;

public class QuickSort implements Runnable {
    int partition(int[] arr, int low, int high) {
        int pivot = arr[(low + high) / 2];
        while (low <= high) {
            while (arr[low] < pivot) {
                low++;
            }
            while (arr[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }

        }
        return low;
    }

    void quickSortRecursion(int[] arr, int low, int high) {
        int pi = partition(arr, low, high);
        if (low < pi - 1) {
            quickSortRecursion(arr, low, pi - 1);
        }
        if (pi < high) {
            quickSortRecursion(arr, pi, high);
        }
    }

    @Override
    public void run() {
        int array[] = {4, 2, 1, 5, 8, 52};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSortRecursion(array, 0, array.length - 1);
        quickSort.printArray(array);
    }

    private void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }
}
