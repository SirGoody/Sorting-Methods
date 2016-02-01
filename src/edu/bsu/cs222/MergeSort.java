package edu.bsu.cs222;

/**
Created by Chase Goodman  1/27/16
        */
public class MergeSort {
    private int[] numbers;
    private int[] helper;

    public void sort(int[] values) {
        this.numbers = values; //renaming the array to numbers
        int number = values.length; //Getting the length of the array
        this.helper = new int[number]; //Setting a helper array
        mergeSort(0, number - 1); //Sorting from the beginning of the array to the end
    }

    private void mergeSort(int low, int high) {
        // check if low is smaller then high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergeSort(low, middle);
            // Sort the right side of the array
            mergeSort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}
